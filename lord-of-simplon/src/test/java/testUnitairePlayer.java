import fr.simplon.lordofsimplon.api.heroes.IHeroe;
import fr.simplon.lordofsimplon.api.player.Player;
import fr.simplon.lordofsimplon.impl.heroes.Heroe;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class testUnitairePlayer {

    /* Cannot invoke "fr.simplon.lordofsimplon.api.heroes.IHeroe.getName()"
     * because the return value of "fr.simplon.lordofsimplon.api.player.Player.getHeroe()" is null
     *
     * Pour tester, il faut faire un scénario de test.
     */
    @Test
    public void testPlayer() {

        IHeroe monHero = new Heroe("mage", null); // Arrange La mise en place de l’environnement : création et initialisation

        Player joueur = new Player(monHero, "Typh", 1); // des objets nécessaires à l’exécution du test.


        IHeroe heroTyph = joueur.getHeroe();  // Bloc Act Le test proprement dit.


        Assertions.assertNotNull(joueur.getHeroe(), "null"); // Bloc Assert La vérification des résultats obtenus par le test.

        Assertions.assertEquals(heroTyph,joueur.getHeroe());
    }
}