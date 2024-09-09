from typing import List
import random

global seat_num
global date
global time
global num_Of_Seats
global available_seats

class AllTicketsSold(Exception):
    def __init__(self, date, time):
        self.date=date
        self.time=time

def generate_seats(num_Of_Seats):
        seat_names = []  # Initialize an empty list to store seat names

        for i in range(1, num_Of_Seats + 1):
            seat_name = f'Seat {i}'  # Create a seat name using the current value of i
            seat_names.append(seat_name)  # Add the seat name to the list

            return seat_names
class Airplane:
    def __init__(self, date, time,num_Of_Seats):
        self.date=date
        self.time=time
        self.num_Of_Seats=generate_seats(num_Of_Seats)

    def buy_ticket(self):
        seat_names = []
        if not seat_names:
            raise AllTicketsSold(self.date, self.time)

        # Simulate ticket purchase by removing a seat
        return self.seat_names.pop()

# Creating four airplanes for December 24 Christmas eve
plane1 = Airplane('December 24', '3:00 PM', 20)
plane2 = Airplane('December 24', '5:00 PM', 20)
plane3 = Airplane('December 24', '4:00 PM', 20)
plane4 = Airplane('December 24', '6:00 PM', 20)

try:
    # Attempt to buy tickets
    ticket1 = plane1.buy_ticket()
    print(f'Ticket purchased for {ticket1} on {plane1.date} at {plane1.time}')

    ticket2 = plane2.buy_ticket()
    print(f'Ticket purchased for {ticket2} on {plane2.date} at {plane2.time}')

    ticket3 = plane3.buy_ticket()
    print(f'Ticket purchased for {ticket3} on {plane3.date} at {plane3.time}')

    ticket4 = plane4.buy_ticket()
    print(f'Ticket purchased for {ticket4} on {plane4.date} at {plane4.time}')

    # Attempt to buy more tickets than available (should raise an exception)
    additional_ticket = plane1.buy_ticket()
except AllTicketsSold as e:
    print(f'All tickets are sold out for {e.date} at {e.time}.')

class ReserveTicket:
    # reserve a ticket for a flight
    def reserve_ticket() -> None:
        seat_names = []
        date = input('Enter a date of the flight. ')
        time = input('Enter a time of the flight. ')
        
        num_Of_Seats = int(input('Enter the number of seats. '))
        seat_num = random.randint(1, 20)

        # append to array/list if the seat number is not in available seats
        if seat_num not in seat_names:
            generate_seats(num_Of_Seats)
        
        if num_Of_Seats > 1 and num_Of_Seats <= 20:
            print('Tickets purchased')
        elif num_Of_Seats == 1:
            print('Ticket purchased')
        if num_Of_Seats > 20:
            raise AllTicketsSold(date, time)
        
        print("Ticket Confirmation:")
        print("Flight Date:", date)
        print("Flight Time:", time)
        print(f'Your seat number is {seat_num}.')

    # cancel a seat reservation and return a ticket
    def cancel_reservation(date: str, time: str, seat_num: int) -> None:
        seat_names = []
        if seat_num in seat_names:
            confirm_cancellation = input('Are you sure you want to cancel your seat reservation? ')
            if confirm_cancellation.lower() == 'yes':
                cancelled_seat = seat_names.pop(seat_num)
                print(f"Your seat reservation is cancelled, and your ticket is returned. Seat #{cancelled_seat} is available.")
        else:
            print(f"Seat #{seat_num} is not reserved.")

    if __name__ == '__main__':
        print('United Airlines Reservation System')
        print('Hello future passenger! Welcome to the United Airlines Reservation System.')
        print('We usually have multiple airplanes that fly between Greensboro and Newark daily.')
        print('However, we have only 4 airplanes on December 24, Christmas Eve.')
        print('Two of those airplanes will depart from Greensboro at 3:00 and 5:00 pm.')
        print('The other two will depart from Newark at 4:00 pm and 6:00 pm.')
        action = ""
        while action != "leave reservation system":
            print("Please enter \"reserve ticket\" to reserve a ticket.\nPlease enter \"cancel reservation\" to cancel your flight reservation.")
            print("Please enter \"leave reservation system\" to exit.")
            action = input()
            if action == "reserve ticket":
                reserve_ticket()
                continue
            elif action == "cancel reservation":
                date = input('Enter your reserved flight date. ')
                time = input('Enter your reserved flight time. ')
                seat_num = int(input('Enter your seat number. '))
                cancel_reservation(date, time, seat_num)
                continue
            elif action == "leave reservation system":
                break
        print("Thank you for using the \"United Airlines Reservation System\".")
