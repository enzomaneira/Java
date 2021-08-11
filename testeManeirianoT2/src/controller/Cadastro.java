package controller;

import model.Usuario;
import model.VetDin;

public class Cadastro{

    public VetDin cad;
    
    Cadastro(){
        this.cad = new VetDin(); 
    }
    

    public void inserir (Usuario a){
        this.cad.inserir(a);
    }

    public boolean remover (String nome){
        boolean ret = false;
        int indice = buscar(nome);
        if(indice == -1){
            System.out.println("Erro");
            return ret;
        } 
        this.cad.remover(indice);
        ret = true;
        
        return ret;
    }
    
    public void listar() {
    	System.out.println(cad);
    		
    	}
        
    private int buscar(String nome) { //busca nome no vetor dinâmico
        int indice = -1;
        Object vet[] = this.cad.getVetor();
        if(vet != null){
            for (int i = 0; i < vet.length; i++){
                Usuario a = (Usuario) vet[i];
                if (a.getNome().equals(nome)){
                    indice = i;
                    break;
                }
            } 
        }
        return indice;
    }
    
    static int x; 
    
    public int buscarP1(String nome) { //busca nome no vetor dinâmico
        Object vet[] = this.cad.getVetor();
        if(vet != null){
            for (int i = 0; i < vet.length; i++){
                Usuario a = (Usuario) vet[i];
                if (a.getNome().equals(nome)){
                    x = a.getP1();
                }
            }
        }
        return x;
    }
    
    public int buscarP2(String nome) { //busca nome no vetor dinâmico
        Object vet[] = this.cad.getVetor();
        if(vet != null){
            for (int i = 0; i < vet.length; i++){
                Usuario a = (Usuario) vet[i];
                if (a.getNome().equals(nome)){
                    x = a.getP2();
                }
            }
        }
        return x;
    }
    
    public int buscarP3(String nome) { //busca nome no vetor dinâmico
        Object vet[] = this.cad.getVetor();
        if(vet != null){
            for (int i = 0; i < vet.length; i++){
                Usuario a = (Usuario) vet[i];
                if (a.getNome().equals(nome)){
                    x = a.getP3();
                }
            }
        }
        return x;
    }
    
    public int buscarP4(String nome) { //busca nome no vetor dinâmico
        Object vet[] = this.cad.getVetor();
        if(vet != null){
            for (int i = 0; i < vet.length; i++){
                Usuario a = (Usuario) vet[i];
                if (a.getNome().equals(nome)){
                    x = a.getP4();
                }
            }
        }
        return x;
    }
    
    public int buscarP5(String nome) { //busca nome no vetor dinâmico
        Object vet[] = this.cad.getVetor();
        if(vet != null){
            for (int i = 0; i < vet.length; i++){
                Usuario a = (Usuario) vet[i];
                if (a.getNome().equals(nome)){
                    x = a.getP5();
                }
            }
        }
        return x;
    }
    
    public int buscarP6(String nome) { //busca nome no vetor dinâmico
        Object vet[] = this.cad.getVetor();
        if(vet != null){
            for (int i = 0; i < vet.length; i++){
                Usuario a = (Usuario) vet[i];
                if (a.getNome().equals(nome)){
                    x = a.getP6();
                }
            }
        }
        return x;
    }
    
    public int buscarP7(String nome) { //busca nome no vetor dinâmico
        Object vet[] = this.cad.getVetor();
        if(vet != null){
            for (int i = 0; i < vet.length; i++){
                Usuario a = (Usuario) vet[i];
                if (a.getNome().equals(nome)){
                    x = a.getP7();
                }
            }
        }
        return x;
    }
    
    public int buscarP8(String nome) { //busca nome no vetor dinâmico
        Object vet[] = this.cad.getVetor();
        if(vet != null){
            for (int i = 0; i < vet.length; i++){
                Usuario a = (Usuario) vet[i];
                if (a.getNome().equals(nome)){
                    x = a.getP8();
                }
            }
        }
        return x;
    }
    
    public int buscarP9(String nome) { //busca nome no vetor dinâmico
        Object vet[] = this.cad.getVetor();
        if(vet != null){
            for (int i = 0; i < vet.length; i++){
                Usuario a = (Usuario) vet[i];
                if (a.getNome().equals(nome)){
                    x = a.getP9();
                }
            }
        }
        return x;
    }
    
    public int buscarP10(String nome) { //busca nome no vetor dinâmico
        Object vet[] = this.cad.getVetor();
        if(vet != null){
            for (int i = 0; i < vet.length; i++){
                Usuario a = (Usuario) vet[i];
                if (a.getNome().equals(nome)){
                    x = a.getP10();
                }
            }
        }
        return x;
    }
    
    
    
    
    
}
