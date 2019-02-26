package Prohledavani_grafu_WaterPuzzle;


public class Dva_dzbany {
	  
		int sklenice_A_plna = 3;
		int sklenice_B_plna = 4;
		int sklenice_A = 0;
		int sklenice_B = 0;
		int mix = 2;
		

		void checkMix() {
			
			int fin = 0;
			
			while(fin != 1) {
				
				if((this.sklenice_A == this.mix) || (this.sklenice_B == this.mix)) { fin = 1; }  //  || je funkce OR
				
				if(this.sklenice_A==0) {
					fillA();
					
				} else if ((this.sklenice_A > 0) && (this.sklenice_B != this.sklenice_B_plna)) {     //  || je funkce AND
					transferSklenice_AtoSklenice_B();
					
				} else if ((this.sklenice_A > 0) && (this.sklenice_B == this.sklenice_B_plna)) {
					emptyB();
					
				}
			
			}
		}
		
		
		void fillA() {
			
			this.sklenice_A = this.sklenice_A_plna ;
			System.out.println("{" + this.sklenice_A + "," + this.sklenice_B + "}");
			
		}
		
		void fillB() {
			this.sklenice_B = this.sklenice_B_plna;
			System.out.println("{" + this.sklenice_A + "," + this.sklenice_B + "}");
		}
		
		void transferSklenice_AtoSklenice_B() {
			
			int fin = 0;
			
			while(fin != 1) {
				
				this.sklenice_B += 1;
				this.sklenice_A -= 1;
				
				if((this.sklenice_B == this.sklenice_B_plna) || (this.sklenice_A == 0)) { fin = 1;}

			}
			
			System.out.println("{" + this.sklenice_A + "," + this.sklenice_B + "}");
			
		}
		
		void emptyA() {
			
			this.sklenice_A=0;
			System.out.println("{" + this.sklenice_A + "," + this.sklenice_B + "}");
			
		}
		
		void emptyB() {
			this.sklenice_B=0;
			System.out.println("{" + this.sklenice_A + "," + this.sklenice_B + "}");
		}

}

