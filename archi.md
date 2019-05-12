# PolyDiploma - Team E

## Overview
3 CLIs are provided in PolyDiploma : 
- Alum
- Organisation
- Compta

### Alum

The Alum CLI allows a student to confirm their attendance and to invite guests.

### Organisation 

The Organisation CLI is used to invite all graduates students, using UniversityService.
It also allows to invite speakers, to confirm their attendance and to assign them to a timeslot.
It also is used to set the date for the ceremony, and to contact the place of the RDD to give them the number of attendees.

### Compta

The Compta CLI allows to pay the host of the ceremony, and to pay for the guests. 
It is also used to consult what do you have left to pay.

## Components

### Get Graduated
Used to get all students who got their diploma
Speaks with ClientOrganisation and University Service
### CommunicateWithHost
Used to send a Mail to the host to notice them with the number of participants
Speaks with ClientOrganisation and Mail Service
### Pay
Speaks with ClientCompta and Bank Service
### PlanCeremony
Speaks with ClientOrganisation and Mail Service
### SuperviseParticipant
Speaks with ClientOrganisation and Alum Service


## Pros
All the responsibilities of our component were well divided, and that allowed us to make an clean architecture and no overlap of functionnalities.

## Cons
Database not persisted when the server is reboot
