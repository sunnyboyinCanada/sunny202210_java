package test.mypac;

public class MacBook {
	private Cpu cpu;
	private Memory memory;
	private HardDisk hardDisk;
	


public MacBook(Cpu cpu, Memory memory, HardDisk hardDisk) {
	this.cpu=cpu;
	this.memory=memory;
	this.hardDisk=hardDisk;
	}

public void doGame() {
	if(this.cpu==null || memory == null || hardDisk==null) {
		System.out.println("부품이 부족해서 맥북이 동작을 할 수 없습니다.");
		return;
	}
	System.out.println("신나게 게임을 해요!");
}
}