package com.example;

import com.example.Node;

import java.util.Arrays;


public class Bus implements SourceOrSinkOrAnchor {

    private int[] weights;
    private Node node;
    private SourceOrSink next;
    private int multiplicity = 0;

    public Bus() { }
    public Bus(Node node) {
	int[] weights = {50, 5};
	this.setWeights(weights);
    }

    @Override public SourceOrSink getNext() { return this.next; }
    @Override public void setNext(SourceOrSink next) { this.next = next; }

    @Override public Node getNode() { return this.node; };
    @Override public void setNode(Node node) { this.node = node; }

    @Override public Bus getBus() { return this; }
    @Override public void setBus(Bus bus) { /* Ø */ }

    public int[] getWeights() { return Arrays.copyOf(this.weights, this.weights.length); }
    public void setWeights(int[] weights) { this.weights = Arrays.copyOf(weights, weights.length); }

    public void setMultiplicity(int multiplicity) {
	this.multiplicity = multiplicity;
    }

    public int getMultiplicity() {
	return this.multiplicity;
    }

    public String toString() { return "BUS" + this.node.toString() + "(" + this.getMultiplicity() + ")"; }
}
