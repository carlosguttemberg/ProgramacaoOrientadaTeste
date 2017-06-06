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
public class ValidarSenha {
    
    
    public boolean VerificaSenhaNula(String senha)
    {        
      return senha.isEmpty();
    }
    
    public boolean VerificaQtdeCaracterSenha(String senha){
        boolean aprovado;
        
        aprovado = true;
        
        if ((senha.length() < 8) || (senha.length() > 12)){
            aprovado = false;
        } else {
            aprovado = true;
        }
        
        return aprovado;
    }
    
    public boolean VerificaCaracterInicial (String senha){
        boolean aprovado;
        char aux;
        
        aprovado = true;
        
        aux = senha.charAt(0);
        
        if(Character.isDigit(aux)){
            aprovado = false;
        } else {
            aprovado = true;
        }
        
        return aprovado;
        
    }
    
    public boolean VerificaQtdeNum (String senha){
        boolean aprovado;
        Integer aux;
        
        aux = 0;
        aprovado = true;

        for (Character c : senha.toCharArray()){
            
            if (Character.isDigit(c) ){
                aux++;
            }
            
        }
        
        if ((aux < 3) || (aux > 5)){
            aprovado = false;
        } else {
            aprovado = true;
        }
        
             
        return aprovado;
        
    }
    
    public boolean VerificaCaracterMaiusculo (String senha){
        boolean aprovado;
        
        aprovado = false;
        
        for (Character c : senha.toCharArray()){
            
            if (Character.isUpperCase(c)){
                aprovado = true;
                System.out.println("Aprovado");
                break;  
            }
            
        }
        
        return aprovado;
    }
            
    public boolean VerificaSequenciaCharacteres(String login, String senha){
        return !(senha.contains(login) || senha.contains(login.toLowerCase()));
    }
}
