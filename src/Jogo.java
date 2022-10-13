import javax.swing.JOptionPane;

public class Jogo extends Personagem {
	public Jogo() {}
	public void ControlarAcoesDosPersonagens(Personagem personagem) {
		if (personagem instanceof Cavaleiro) {
			Cavaleiro c = (Cavaleiro) personagem;
			JOptionPane.showMessageDialog(null,"O nome do cavaleiro é: "+c.getNome());
			c.andar();
			c.guardarItem();
			c.usarItem();
		} else if (personagem instanceof Mago){
			Mago m = (Mago) personagem;
			JOptionPane.showMessageDialog(null,"O nome do mago é: "+m.getNome());
			m.andar();
			m.guardarItem();
			m.usarItem();
		} else if (personagem instanceof Dragao){
			Dragao d = (Dragao) personagem;
			JOptionPane.showMessageDialog(null,"O nome do Dragão é: "+d.getNome());
			d.andar();
			d.guardarItem();
			d.usarItem();
		}
	}
}
