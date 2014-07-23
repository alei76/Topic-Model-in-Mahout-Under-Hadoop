Topic-Model-in-Mahout-Under-Hadoop
==================================

Please read the description and readme ﬁle of the dataset ﬁrst.
http://archive.ics.uci.edu/ml/datasets/Bag+of+Words

Topic models is run on NIPS full papers.
This is the clean dataset with stop words removal, word stemming and other preprocessing
done. The format of the docword.nips.txt ﬁle extracted from docword.nips.txt.gz is 3 header
lines, followed by NNZ triples:
- - -
D
W
NNZ
docID wordID count
docID wordID count
docID wordID count
docID wordID count
...
docID wordID count
docID wordID count
docID wordID count
- - -
The format of the vocab.nips.txt ﬁle contains all unique words. The number in each line is
the corresponding wordID. For example, the wordID of “a2i" is 1.

Goal:
-----

- write codes (document_generator.java) to generate all documents ﬁrst. Each
document can be named by docID.txt

- For each topic, print out top 10 words with their corresponding probabilities. (Topic
term distribution)

- For each document, print out probabilities for each topic. (Document-topic distribution)

- Readme file containing all mahout and hadoop commands.

