/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificasenha;

/**
 *
 * @author carlos
 */
public class VerificaSenha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        User user = new User();
        user.setLogin("chubaka");
        user.setSenha("12as3");
        
        ValidarSenha valida = new ValidarSenha();
        
        valida.VerificaCaracterMaiusculo(user.getSenha());
        
    }
    
}
