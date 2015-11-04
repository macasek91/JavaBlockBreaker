import java.util.ArrayList;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class BlockBreakerPanel extends JPanel {

	ArrayList<Block> blocks = new ArrayList<Block>();
	
	BlockBreakerPanel(){
		for(int i=0; i<8; i++){
			blocks.add(new Block((i*60+2), 0, 60, 25, "blue.png"));
			blocks.add(new Block((i*60+2), 0, 60, 25, "blue.png"));
			blocks.add(new Block((i*60+2), 0, 60, 25, "blue.png"));
			blocks.add(new Block((i*60+2), 0, 60, 25, "blue.png"));
		}
		
	}
	
}
