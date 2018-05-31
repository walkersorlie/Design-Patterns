import java.util.concurrent.*;

public class TeaFacade {
  private TeaCup cup;
  private Water water;
  private TeaInfuser infuser;

  public TeaFacade(TeaCup cup, Water water, TeaInfuser infuser) {
    this.cup = cup;
    this.water = water;
    this.infuser = infuser;
  }

  public void makeTea(String teaType) {
    Tea tea = new Tea(teaType);

    ExecutorService service = Executors.newSingleThreadExecutor();
    service.execute(new Runnable() { public void run() { infuser.addTea(tea); }  });
    
		water.boilWater();
		cup.addWater(water);
	  cup.setSteepTime(15);
		cup.steep();
  }

}
