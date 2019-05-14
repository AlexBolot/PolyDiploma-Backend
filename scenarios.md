#Scénario de bout en bout

## Dans la CLI Organisation


##### L'administration affiche le planning alors que rien n'est mis
```
afficher_planning
```

##### L'administration définit la date de la cérémonie et invite des étudiants, puis affiche le planning
```
definir_date 14 5 2019 20 00 23 59
inviter_etudiants

afficher_planning
```
##### Le BDE veut savoir combien de participants viennent pour l'instant
```
total
```
##### L'administration essaie de confirmer la venue d'un intervenant qui n'a pas été invité
```
confirmer_presence melon.musk@spaceX.com 16 0 16 30
```
##### L'administration corrige son erreur et invite le speaker, puis consulte le planning
```
inviter_VIP Melon Musk melon.musk@spaceX.com
confirmer_presence melon.musk@spaceX.com 16 0 16 30
afficher_planning
```

##### L'administration ajoute des intervenants et les horaires de passage
```
inviter_VIP Alexandre Caminada alexandre.caminada@unice.fr
inviter_VIP Igor Litovsky igor.litovsky@unice.fr
inviter_VIP Michel Sardou michou@sardou.fr

confirmer_presence alexandre.caminada@unice.fr 15 0 15 15
confirmer_presence michou@sardou.fr 15 30 16 0
confirmer_presence igor.litovsky@unice.fr 15 15 15 30
```

##### L'administration affiche la liste des filières présentes et definit leurs horaires
```
liste_filieres

horaire_filiere SI 14 30 15 00
horaire_filiere MAM 16 30 18 00
```

##### L'administration affiche la liste des participants et le total 
```
liste_participants
total
```

## Dans la CLI Alum

##### Des étudiants confirment leur présence
```
confirmer_venue alexandre.bolot@etu.unice.fr
confirmer_venue lucas.oms@etu.unice.fr
confirmer_venue prune.pillone@etu.unice.fr
```

##### Un étudiant essaye d'inviter 3 invités sans avoir confirmé sa venue
```
ajouter_invité hugo.francois@etu.unice.fr Georges Lucas
ajouter_invité hugo.francois@etu.unice.fr JRR Tolkien
```

##### L'étudiant confirme sa venue et invite quelqu'un
```
confirmer_venue hugo.francois@etu.unice.fr
ajouter_invité hugo.francois@etu.unice.fr Georges Lucas
ajouter_invité hugo.francois@etu.unice.fr JRR Tolkien
```

##### Un étudiant veut payer son solde alors qu'il n'a rien à payer
```
payer hugo.francois@etu.unice.fr 444433332221111
```

## Dans la CLI Compta

##### La compta paie la salle
```
payer 2500 FR1234567989
```
## Dans la CLI Organisation

##### On envoie un mail à l'hôte de cérémonie
```
reserver_ceremonie host@gmail.com
```
## Dans la CLI Alum
##### Un étudiant ajoute un autre invité, payant car c'est le troisième
```
ajouter_invité hugo.francois@etu.unice.fr Chef Bruno
```

##### Un étudiant consulte son solde
```
voir_solde hugo.francois@etu.unice.fr
```
##### Un étudiant paie pour son invité payant
```
payer hugo.francois@etu.unice.fr 444433332221111
```


