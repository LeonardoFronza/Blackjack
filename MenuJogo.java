//LEONARDO FRONZA
public class MenuJogo
{   
    //Metodo criado para o menu do jogo.
    public void menuDoJogo() {
        Teclado tec = new Teclado();
        
        //Da boas vindas ao jogadores
        System.out.println("BEM VINDO AO JOGO 21! - LEONARDO FRONZA");
         
        //While responsavel por mostrar a regra e fazer um "Menu"
        while(true) {
            //Mostra as opΓ§Γ΅es ao usuario
            System.out.println("π’π’π’π’π’π’π’π’π’π’π’π’π’π’π’π’π’π’π’π’π’π’π’π’π’π’π’π’π’π’π’π’π’π’π’π’π’π’π’π’π’π’π’π’π’π’π’π’π’π’π’π’π’π’π’π’π’π’π’π’π’π’π’π’π’π’π’π’π’π’π’π’π’");
            System.out.println("-------β’1)START GAME  β’2)READ THE RULES-------");
            int respostaUser = tec.leInt();
            
            //Caso o jogador escolha a opΓ§Γ£o 2, irΓ‘ entrar no if, o qual vai mostrar as regras do jogo e dar uma opΓ§Γ£o de voltar ao menu.
            if(respostaUser == 2){
                System.out.println("β’RULES");
                System.out.println("β¬ Se o jogador passar a vez, nΓ£o joga os dados");
                System.out.println("β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β ");
                System.out.println("β¬ Se o jogador escolher jogar os dados, joga primeiro o dado branco. \n O valor do dado branco soma-se aos pontos que ele possui (por exemplo, se o jogador tinha 5 pontos e tirou 3 no dado branco, agora ele tem 8 pontos). \nLogo em seguida, o jogador joga o dado vermelho.\nSe o valor do dado vermelho for 6, este valor Γ© duplicado e somado aos pontos que ele jΓ‘ possui \n(por exemplo, se o jogador tinha 8 pontos apΓ³s jogar o dado branco, e tirou 6 no dado vermelho, ele\nagora tem 8 + (2 x 6) = 20 pontos). Qualquer outro valor no dado vermelho Γ© simplesmente\nsomado aos pontos do jogador, assim como o dado branco.");
                System.out.println("β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β β ");
                System.out.println("β¬ Depois que um jogador passa a vez ou joga os dois dados, Γ© a vez do outro escolher se joga ou se\npassa a vez, e assim o jogo continua. Uma rodada termina quando todos os jogadores fizerem sua aΓ§Γ£o\n(seja esta aΓ§Γ£o passar a vez ou jogar). O jogo termina apΓ³s 3 rodadas.");
                
                respostaUser = tec.leInt("β? 3)Back");
                
                while(respostaUser != 3)
                    respostaUser = tec.leInt("Digite 3 para voltar ao menu!");   
            }
    
            //Caso o usuairo escolha 1, serΓ‘ finalizado o while e iniciado o jogo. 
            if(respostaUser == 1)
                break;
        }
    }
}
