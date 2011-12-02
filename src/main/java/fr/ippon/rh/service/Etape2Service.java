package fr.ippon.rh.service;

import org.jasypt.util.text.BasicTextEncryptor;
import org.springframework.stereotype.Service;

/**
 * Etape 2 du jeu.
 */
@Service
public class Etape2Service {

    private static final String etape2Texte = "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";

    private static final String etape2MotDePasse = "Ceci n'est pas le bon mot de passe :-(";
    /*
======================
Bienvenue à l'étape 2!
======================

 Pour trouver le bon mot de passe, trouvez la solution au problème suivant:

Vous partez à Devoxx France, et votre sac peut contenir pour 30 Kg d'objets.
Malheureusement, vous voulez emporter de nombreux objets: votre iPhone, votre iPad, votre MacBook Pro,
votre exemplaire de "Spring par la pratique" à faire dédicacer...

Tous ces objets n'ont pas le même poids et n'ont pas la même valeur: votre "Spring par la pratique" est plus
lourd que votre iPhone, et a moins de valeur.
Vous cherchez donc à optimiser ce que vous allez emporter: quels objets devez-vous prendre pour avoir le
maximum de valeur dans votre sac?

Voici la liste des objets, avec leur poids et leur valeur. Le mot de passe recherché est la concaténation des ids
(triés par ordre croissant) de tous les objets à emporter:

ID	valeur	poids
1	737	7
2	842	4
3	158	1
4	36	28
5	578	26
6	173	19
7	268	28
8	273	17
9	88	26
10	699	9
11	243	11
12	578	18
13	63	27
14	639	8
15	639	18
16	639	6
17	155	15
18	819	28
19	451	19
20	183	22
21	707	29
22	971	16
23	104	9
24	370	7
25	998	29
26	380	2
27	442	3
28	760	5
29	859	1
30	146	18
31	282	28
32	757	9
33	875	8
34	594	20
35	366	21
36	666	27
37	615	13
38	579	24
39	804	2
40	764	24
     */


    /**
     * Décrypte le texte de l'étape 3.
     */
    public String decriptText() {
        BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
        textEncryptor.setPassword(etape2MotDePasse);
        return textEncryptor.decrypt(etape2Texte);
    }
}
