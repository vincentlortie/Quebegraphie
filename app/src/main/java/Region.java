/**
 * Created by Ecole on 2018-02-22.
 * conventions nom variable: minuscules pour les nom des regions,
 * si plusieurs mots, accronymes. pas d'accents.
 */

public class Region {
    int adm;
    String nom;
    public Region(String nom, int adm){
        this.adm=adm;
        this.nom=nom;
    }
    public static void main(String args[]){
        Region bsl = new Region("Bas-Saint-Laurent",1);
        Region slsj = new Region("Saugenay-Lac-St-Jean",2);
        Region cn = new Region ("Capitale-Nationale",3);
        Region mauricie = new Region("Mauricie", 4);
        Region estrie = new Region("Estrie",5);
        Region montreal = new Region("Montreal",6);
        Region outaouais = new Region("Outaouais",7);
        Region at = new Region("Abitibi-Témiscamingue",8);
        Region con = new Region("Côte-Nord",9);
        Region ndq = new Region ("Nord-du-Québec",10);
        Region gim = new Region("Gaspésie-Îles-de-la-Madeleine",11);
        Region ca = new Region("Chaudières-Appalaches",12);
        Region laval = new Region("Laval",13);
        Region lanaudiere = new Region("Lanaudière",14);
        Region laurentides = new Region("Laurentides",15);
        Region monterigie = new Region("Montérigie",16);
        Region cdq = new Region("Centre-du-Québec",17);


    }
}
