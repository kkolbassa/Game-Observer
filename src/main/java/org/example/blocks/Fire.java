package org.example.blocks;

public class Fire extends CountableBlock{
    public Fire(int count) {
        super(count);
        this.name = "Костер";
    }
    public Fire(int count, String name) {
        super(count);
        this.name = name;
    }

    @Override
    public boolean hasFire() {
        return true;
    }

    @Override
    public void buildFire() {
        setCount(getCount()+1);
    }
}
