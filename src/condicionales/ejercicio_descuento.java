package condicionales;

import javax.swing.JOptionPane;

public class ejercicio_descuento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float precioCompra,descuento;
		
		precioCompra = Float.parseFloat(JOptionPane.showInputDialog("Digite el precio de la compra"));
		
		if(precioCompra > 300) {
			descuento = precioCompra * 0.20f;
			precioCompra -= descuento;
			JOptionPane.showMessageDialog(null, "El precio compra con descuento es : " + precioCompra);			
		}else {
			JOptionPane.showMessageDialog(null, "El precio compra es : " + precioCompra);
		}
	}

}
