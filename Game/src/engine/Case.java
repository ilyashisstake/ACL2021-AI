package engine;

import java.util.*; 

public class Case {

	private int [][] labyrinthe; 
	
	private int [][] portail;
	
	private int [][] bonus;
	
	private int [][] malus;
	
	private int [][] sortie; 
	
	Case(){
		
		List<List<Integer>> liste= new ArrayList<List<Integer>>();
		for (int k = 160;k<180;k=k+20) {
			for(int j=0;j<140;j=j+20) {
				liste.add(new ArrayList<Integer>());
				liste.get(liste.size()-1).add(k);
				liste.get(liste.size()-1).add(j);
			}
		}
		
		for (int k = 40;k<60;k=k+20) {
			for(int j=80;j<140;j=j+20) {
				liste.add(new ArrayList<Integer>());
				liste.get(liste.size()-1).add(k);
				liste.get(liste.size()-1).add(j);
			}
		}
		
		for (int k = 40;k<240;k=k+20) {
			for(int j=120;j<140;j=j+20) {
				liste.add(new ArrayList<Integer>());
				liste.get(liste.size()-1).add(k);
				liste.get(liste.size()-1).add(j);
			}
		}
		for (int k = 40;k<120;k=k+20) {
			for(int j=60;j<80;j=j+20) {
				liste.add(new ArrayList<Integer>());
				liste.get(liste.size()-1).add(k);
				liste.get(liste.size()-1).add(j);
			}
		}
	
		for (int k = 0;k<80;k=k+20) {
			for(int j=200;j<220;j=j+20) {
				liste.add(new ArrayList<Integer>());
				liste.get(liste.size()-1).add(k);
				liste.get(liste.size()-1).add(j);
			}
		}
		for (int k = 120;k<140;k=k+20) {
			for(int j=120;j<220;j=j+20) {
				liste.add(new ArrayList<Integer>());
				liste.get(liste.size()-1).add(k);
				liste.get(liste.size()-1).add(j);
			}
		}
		for (int k = 240;k<260;k=k+20) {
			for(int j=120;j<220;j=j+20) {
				liste.add(new ArrayList<Integer>());
				liste.get(liste.size()-1).add(k);
				liste.get(liste.size()-1).add(j);
			}
		}
		for (int k = 180;k<240;k=k+20) {
			for(int j=200;j<220;j=j+20) {
				liste.add(new ArrayList<Integer>());
				liste.get(liste.size()-1).add(k);
				liste.get(liste.size()-1).add(j);
			}
		}
		for (int k = 180;k<200;k=k+20) {
			for(int j=220;j<300;j=j+20) {
				liste.add(new ArrayList<Integer>());
				liste.get(liste.size()-1).add(k);
				liste.get(liste.size()-1).add(j);
			}
		}
		for (int k = 80;k<200;k=k+20) {
			for(int j=280;j<300;j=j+20) {
				liste.add(new ArrayList<Integer>());
				liste.get(liste.size()-1).add(k);
				liste.get(liste.size()-1).add(j);
			}
		}
		
		for (int k = 240;k<260;k=k+20) {
			for(int j=280;j<360;j=j+20) {
				liste.add(new ArrayList<Integer>());
				liste.get(liste.size()-1).add(k);
				liste.get(liste.size()-1).add(j);
			}
		}
		
		for (int k = 340;k<360;k=k+20) {
			for(int j=300;j<360;j=j+20) {
				liste.add(new ArrayList<Integer>());
				liste.get(liste.size()-1).add(k);
				liste.get(liste.size()-1).add(j);
			}
		}
		for (int k = 340;k<360;k=k+20) {
			for(int j=0;j<80;j=j+20) {
				liste.add(new ArrayList<Integer>());
				liste.get(liste.size()-1).add(k);
				liste.get(liste.size()-1).add(j);
			}
		}
		
		
		for (int k = 220;k<300;k=k+20) {
			for(int j=60;j<80;j=j+20) {
				liste.add(new ArrayList<Integer>());
				liste.get(liste.size()-1).add(k);
				liste.get(liste.size()-1).add(j);
			}
		}
		
		for (int k = 280;k<360;k=k+20) {
			for(int j=120;j<140;j=j+20) {
				liste.add(new ArrayList<Integer>());
				liste.get(liste.size()-1).add(k);
				liste.get(liste.size()-1).add(j);
			}
		}
		for (int k = 280;k<300;k=k+20) {
			for(int j=60;j<140;j=j+20) {
				liste.add(new ArrayList<Integer>());
				liste.get(liste.size()-1).add(k);
				liste.get(liste.size()-1).add(j);
			}
		}
		for (int k = 340;k<360;k=k+20) {
			for(int j=140;j<220;j=j+20) {
				liste.add(new ArrayList<Integer>());
				liste.get(liste.size()-1).add(k);
				liste.get(liste.size()-1).add(j);
			}
		}
		
		for (int k = 300;k<400;k=k+20) {
			for(int j=260;j<280;j=j+20) {
				liste.add(new ArrayList<Integer>());
				liste.get(liste.size()-1).add(k);
				liste.get(liste.size()-1).add(j);
			}
		}
		
		for (int k = 280;k<300;k=k+20) {
			for(int j=200;j<280;j=j+20) {
				liste.add(new ArrayList<Integer>());
				liste.get(liste.size()-1).add(k);
				liste.get(liste.size()-1).add(j);
			}
		}
		for (int k = 400;k<420;k=k+20) {
			for(int j=200;j<280;j=j+20) {
				liste.add(new ArrayList<Integer>());
				liste.get(liste.size()-1).add(k);
				liste.get(liste.size()-1).add(j);
			}
		}
		for (int k = 360;k<480;k=k+20) {
			for(int j=200;j<220;j=j+20) {
				liste.add(new ArrayList<Integer>());
				liste.get(liste.size()-1).add(k);
				liste.get(liste.size()-1).add(j);
			}
		}
		
		for (int k = 460;k<480;k=k+20) {
			for(int j=80;j<220;j=j+20) {
				liste.add(new ArrayList<Integer>());
				liste.get(liste.size()-1).add(k);
				liste.get(liste.size()-1).add(j);
			}
		}
		
		for (int k = 400;k<500;k=k+20) {
			for(int j=80;j<100;j=j+20) {
				liste.add(new ArrayList<Integer>());
				liste.get(liste.size()-1).add(k);
				liste.get(liste.size()-1).add(j);
			}
		}
		
		for (int k = 400;k<420;k=k+20) {
			for(int j=80;j<180;j=j+20) {
				liste.add(new ArrayList<Integer>());
				liste.get(liste.size()-1).add(k);
				liste.get(liste.size()-1).add(j);
			}
		}
		
		for (int k = 400;k<540;k=k+20) {
			for(int j=300;j<320;j=j+20) {
				liste.add(new ArrayList<Integer>());
				liste.get(liste.size()-1).add(k);
				liste.get(liste.size()-1).add(j);
			}
		}
		
		labyrinthe=new int[liste.size()][];
		for(int k=0;k<liste.size();k++) {
			 	Object [] l=liste.get(k).toArray();
			 	int[] obj_int = new int[l.length];
			 	for(int i=0; i < l.length; i++)
			 	  
			 	  obj_int[i]=(int) l[i];
			 	labyrinthe[k]=obj_int;
		}
		
		
		portail= new int [][] {{360,280}};
		sortie= new int [][] {{500,320}};
		bonus= new int [][] {{60,100},{220,140},{440,100}};
		malus= new int [][] {{500,100},{340,100}};
	}
	
	public int [][] getLabyrinthe(){
		return labyrinthe;
	}
	public int [][] getSortie(){
		return sortie;
	}
	public int [][] getMalus(){
		return malus;
	}
	public int [][] getBonus(){
		return bonus;
	}
	public int [][] getPortail(){
		return portail;
	}
	public void removeBonus(int x,int y) {
		 for (int i = 0; i < this.bonus.length; i++) {
			 if (this.bonus[i][0]==x && this.bonus[i][1]==y) {
	                int [][] newArr = new int[this.bonus.length - 1][2];
	                for(int index = 0; index < i; index++){
	                    newArr[index] = this.bonus[index];
	                }
	                for(int j = i; j < this.bonus.length - 1; j++){
	                    newArr[j] = this.bonus[j+1];
	                }
	                this.bonus=newArr.clone();
	                break;
	            }
	        }
		
	}
	public void removeMalus(int x,int y) {
		 for (int i = 0; i < this.malus.length; i++) {
			 if (this.malus[i][0]==x && this.malus[i][1]==y) {
	                int [][] newArr = new int[this.malus.length - 1][2];
	                for(int index = 0; index < i; index++){
	                    newArr[index] = this.malus[index];
	                }
	                for(int j = i; j < this.malus.length - 1; j++){
	                    newArr[j] = this.malus[j+1];
	                }
	                this.malus=newArr.clone();
	                break;
	            }
	        }
		
	}
}
