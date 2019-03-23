package negocio;


import org.lasencinas.solid_dip.InventarioBBDD;
import org.lasencinas.solid_dip.ControladorEstoc;
import org.junit.Assert;
import org.junit.Test;

public class TestControladorEstocIT {

	@Test
	public void test_control_estoc() {
		ControladorEstoc controlador = new ControladorEstoc(new InventarioBBDD());
		
		Assert.assertFalse(controlador.necesitaReponer("tienda norte", "mesa"));
		Assert.assertTrue(controlador.necesitaReponer("tienda norte", "lampara"));

	}

}

