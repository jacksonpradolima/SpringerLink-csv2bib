# csv2bib
In some digital libraries, for instance SpringerLink, the search results are available only in .csv format, but the researchers needs in other formats like bibtex. In this sense, this project was created to help the researchers converting csv files into a bib or ris file.

[![Gittip](https://img.shields.io/badge/Latest%20stable-2.1-green.svg?style=flat-squared)]()
[![Build Status](https://travis-ci.org/jacksonpradolima/csv2bib.svg?branch=master)](https://travis-ci.org/jacksonpradolima/csv2bib)
[![DOI](https://zenodo.org/badge/93668849.svg)](https://zenodo.org/badge/latestdoi/93668849)

# Citation

If this package contributes to a project which leads to a scientific publication, I would appreciate a citation.

```
@misc{pradolima_csv2bib,
  author       = {Prado Lima, Jackson Antonio do and Godóy, Fernando},
  title        = {{csv2bib - Converting search results from some Digital Library}},
  month        = jul,
  year         = 2019,
  doi          = {10.5281/zenodo.3272139},
  url          = {https://doi.org/10.5281/zenodo.3272139}
}
```

# Requirements

- Java 1.8 or above to run
- Maven >= 3.3.9

# How do I start?

1. Dowload the last release;
2. Make the command:

## Running with args in command line
```
java -jar csv2bib-version -fi=src/test/resources/SpringerLink.csv -dl=SpringerLink -doiIndex=5 -extension=bib
```

## Running with properties parameters

1. Access and edit the config file [config.properties](https://github.com/fernandogodoy/csv2bib/blob/master/csv2bib/config.properties)
2. Make the command

```
java -jar csv2bib-version
```


where you must change *version* with the a version available
 
 # Tips
## About the parameters

**-help** or *-h*: Display the commands available.

**-fileIn** or *-fi*: The path to the input file. (required)

**-dl**: Digital Library that the system will get the bibtex informations. (required)

**-doiIndex**: DOI index in the csv file. Starting with 0 (first column). If the value is empty, the index is search in csv file (optional)

**-header**: If the csv contains a header. (optional, default 1)

**-extension**: Extension for exporter references, can use (bib or ris). (optional, default bib) 

## Digital Libraries available
- SpringerLink


