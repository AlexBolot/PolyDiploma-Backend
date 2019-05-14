# PolyDiploma - Team E

## Table of Content

- **Client access to PolyDiploma**
    - **Alum**
    - **Organisation**
    - **Compta**
- **Public access to PolyDiploma**
    - **WebServices**
- **First layer of verification**
    - **Interceptors**
- **Components**
    - **GetGraduated**
    - **CommunicateWithHost**
    - **Pay**
    - **PlanCeremony**
    - **SuperviseParticipant**
- **Project Overview**
    - **Pros**
    - **Cons**
    - **Possible Ugrades**

---

## Client access to PolyDiploma
3 CLIs are provided in PolyDiploma : 
- Alum
- Organisation
- Compta

### Alum
The Alum CLI allows a student to confirm their attendance, invite guests and pay their balance if they add more than 2 guests.
### Organisation 
The Organisation CLI is used to invite all graduating students, using UniversityService.
It also allows to invite speakers, confirm their attendance and assign them to a timeslot.
It also is used to set the date for the ceremony, and contact the host of the ceremony to give them the amount of attendees.
### Compta
The Compta CLI allows to pay the host of the ceremony.
It also allows the accounts service to see a report of all the payment made using PolyDiploma.

---

## Public access to PolyDiploma

### WebServices
3 WebServices allow the CLIs to access the PolyDiploma internal system, using C# remote calls to :
- Alumn WebService
- Organisation WebService
- Compta WebService

Currently each CLI is accessing to its dedicated WebService, but we plan to upgrade that (see the Upgrades section).

---

## First layer of verification

### Interceptors
We implementented Interceptors between our WebService layer and our Comptents layer.
This allows us to perform simple but frequent checkings on parameters sent by the CLIs (such as a negative payment amount, an empty speaker's name).
Those are mostly trivial checkings but we think the earlier it's detected, the faster the user gets a warning and feedback.
Also, now that we implemented this part of our architecture, it can easily be upgraded and extended to non-trivial verifications if necessary.

---

## Components

### Get Graduated
Used to get all students who got their diploma
Accessed from ClientOrganisation and communicates with UniversityService (external service) and SuperviseParticipant (other component)
### CommunicateWithHost
Used to send an email to the host to notice them with the amount of participants
Accessed from ClientOrganisation and communicates with MailService (external service) and SuperviseParticipant (other component)
### Pay
Used to allow payments from students and the accounts service.
Accessed from ClientCompta and SuperviseParticipant and communicates with BankService.
### PlanCeremony
Used to update or obtain the ceremony planning, with a timeslot system.
Accessed from ClientOrganisation and communicates with MailService (external service) and SuperviseParticipant (other component)
### SuperviseParticipant
Used to invite speakers, confirm attendance of both students and speakers and add a guest on the list of a student.
Accessed from ClientOrganisation and ClientAlum, and communicates with Pay

---

## Project Overview

### Pros
All the responsibilities of our component were well divided, and that allowed us to make an clean architecture and no overlap of functionnalities.
Clients only have access to what they have to.

### Cons
Currently the database not persisted yet when the server is reboot

### Possible Upgrades
- We can add a MOM between some of our components and the external sevices, such as MailService and BankService.
- We can also split the Organisatio WebService to divide it's responsibilites and usage \(it will have less impact if one of the Webservices is down\).