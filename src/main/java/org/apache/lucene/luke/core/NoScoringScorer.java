package org.apache.lucene.luke.core;

import org.apache.lucene.search.Scorer;

import java.io.IOException;

public class NoScoringScorer extends Scorer {
  public static final NoScoringScorer INSTANCE = new NoScoringScorer();

  protected NoScoringScorer() {
    super(null);
  }

  @Override
  public float score() throws IOException {
    return 1.0f;
  }

  @Override
  public int docID() {
    return 0;
  }

  @Override
  public int nextDoc() throws IOException {
    return 0;
  }

  @Override
  public int advance(int i) throws IOException {
    return 0;
  }

  @Override
  public long cost() {
    return 0;
  }

  @Override
  public int freq() throws IOException {
    return 1;
  }

}
