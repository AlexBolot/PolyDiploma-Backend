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

The Compta CLI allows to pay

## Components

### Get Graduated
Speaks with ClientOrganisation and university Service
### CommunicateWithHost
Speaks with ClientOrganisation and Mail Service
### Pay
Speaks with ClientCompta and Bank Service
### PlanCeremony
Speaks with ClientOrganisation and mail Service
### SuperviseParticipant
Speaks with ClientOrganisation and Alum


## Pros
Responsability well divided

## Cons
Database not persisted when the server is reboot
