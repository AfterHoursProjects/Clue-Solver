#include <enunciate-common.c>
#ifndef DEF_Clue_Solver_Rest_ns0_card_H
#define DEF_Clue_Solver_Rest_ns0_card_H

/**
 * (no documentation provided)
 */
struct Clue_Solver_Rest_ns0_card {


  /**
   * (no documentation provided)
   */
  xmlChar *name;

  /**
   * (no documentation provided)
   */
  xmlChar *type;
};

/**
 * Reads a Card element from XML. The element to be read is "card", and
 * it is assumed that the reader is pointing to the XML document (not the element).
 *
 * @param reader The XML reader.
 * @return The Card, or NULL in case of error.
 */
struct Clue_Solver_Rest_ns0_card *xml_read_Clue_Solver_Rest_ns0_card(xmlTextReaderPtr reader);

/**
 * Writes a Card to XML under element name "card".
 *
 * @param writer The XML writer.
 * @param _card The Card to write.
 * @return The bytes written (may be 0 in case of buffering) or -1 in case of error.
 */
int xml_write_Clue_Solver_Rest_ns0_card(xmlTextWriterPtr writer, struct Clue_Solver_Rest_ns0_card *_card);

/**
 * Frees a Card.
 *
 * @param _card The Card to free.
 */
void free_Clue_Solver_Rest_ns0_card(struct Clue_Solver_Rest_ns0_card *_card);

/**
 * Reads a Card element from XML. The element to be read is "card", and
 * it is assumed that the reader is already pointing to the element.
 *
 * @param reader The XML reader.
 * @return The Card, or NULL in case of error.
 */
struct Clue_Solver_Rest_ns0_card *xmlTextReaderReadNs0CardElement(xmlTextReaderPtr reader);

/**
 * Writes a Card to XML under element name "card".
 * Does NOT write the namespace prefixes.
 *
 * @param writer The XML writer.
 * @param _card The Card to write.
 * @return The bytes written (may be 0 in case of buffering) or -1 in case of error.
 */
static int xmlTextWriterWriteNs0CardElement(xmlTextWriterPtr writer, struct Clue_Solver_Rest_ns0_card *_card);

/**
 * Writes a Card to XML under element name "card".
 *
 * @param writer The XML writer.
 * @param _card The Card to write.
 * @param writeNamespaces Whether to write the namespace prefixes.
 * @return The bytes written (may be 0 in case of buffering) or -1 in case of error.
 */
static int xmlTextWriterWriteNs0CardElementNS(xmlTextWriterPtr writer, struct Clue_Solver_Rest_ns0_card *_card, int writeNamespaces);

/**
 * Frees the children of a Card.
 *
 * @param _card The Card whose children are to be free.
 */
static void freeNs0CardElement(struct Clue_Solver_Rest_ns0_card *_card);

/**
 * Reads a Card from XML. The reader is assumed to be at the start element.
 *
 * @param reader The XML reader.
 * @return The Card, or NULL in case of error.
 */
static struct Clue_Solver_Rest_ns0_card *xmlTextReaderReadNs0CardType(xmlTextReaderPtr reader);

/**
 * Writes a Card to XML.
 *
 * @param writer The XML writer.
 * @param _card The Card to write.
 * @return The bytes written (may be 0 in case of buffering) or -1 in case of error.
 */
static int xmlTextWriterWriteNs0CardType(xmlTextWriterPtr writer, struct Clue_Solver_Rest_ns0_card *_card);

/**
 * Frees the elements of a Card.
 *
 * @param _card The Card to free.
 */
static void freeNs0CardType(struct Clue_Solver_Rest_ns0_card *_card);

#endif /* DEF_Clue_Solver_Rest_ns0_card_H */
#ifndef DEF_Clue_Solver_Rest_ns0_probability_H
#define DEF_Clue_Solver_Rest_ns0_probability_H

/**
 * (no documentation provided)
 */
struct Clue_Solver_Rest_ns0_probability {


  /**
   * (no documentation provided)
   */
  double cardProbability;

  /**
   * additional elements
   */
  struct xmlBasicNode *wrappedObject;
};

/**
 * Reads a Probability element from XML. The element to be read is "cardProbability", and
 * it is assumed that the reader is pointing to the XML document (not the element).
 *
 * @param reader The XML reader.
 * @return The Probability, or NULL in case of error.
 */
struct Clue_Solver_Rest_ns0_probability *xml_read_Clue_Solver_Rest_ns0_probability(xmlTextReaderPtr reader);

/**
 * Writes a Probability to XML under element name "cardProbability".
 *
 * @param writer The XML writer.
 * @param _probability The Probability to write.
 * @return The bytes written (may be 0 in case of buffering) or -1 in case of error.
 */
int xml_write_Clue_Solver_Rest_ns0_probability(xmlTextWriterPtr writer, struct Clue_Solver_Rest_ns0_probability *_probability);

/**
 * Frees a Probability.
 *
 * @param _probability The Probability to free.
 */
void free_Clue_Solver_Rest_ns0_probability(struct Clue_Solver_Rest_ns0_probability *_probability);

/**
 * Reads a Probability element from XML. The element to be read is "cardProbability", and
 * it is assumed that the reader is already pointing to the element.
 *
 * @param reader The XML reader.
 * @return The Probability, or NULL in case of error.
 */
struct Clue_Solver_Rest_ns0_probability *xmlTextReaderReadNs0CardProbabilityElement(xmlTextReaderPtr reader);

/**
 * Writes a Probability to XML under element name "cardProbability".
 * Does NOT write the namespace prefixes.
 *
 * @param writer The XML writer.
 * @param _probability The Probability to write.
 * @return The bytes written (may be 0 in case of buffering) or -1 in case of error.
 */
static int xmlTextWriterWriteNs0CardProbabilityElement(xmlTextWriterPtr writer, struct Clue_Solver_Rest_ns0_probability *_probability);

/**
 * Writes a Probability to XML under element name "cardProbability".
 *
 * @param writer The XML writer.
 * @param _probability The Probability to write.
 * @param writeNamespaces Whether to write the namespace prefixes.
 * @return The bytes written (may be 0 in case of buffering) or -1 in case of error.
 */
static int xmlTextWriterWriteNs0CardProbabilityElementNS(xmlTextWriterPtr writer, struct Clue_Solver_Rest_ns0_probability *_probability, int writeNamespaces);

/**
 * Frees the children of a Probability.
 *
 * @param _probability The Probability whose children are to be free.
 */
static void freeNs0CardProbabilityElement(struct Clue_Solver_Rest_ns0_probability *_probability);

/**
 * Reads a Probability from XML. The reader is assumed to be at the start element.
 *
 * @param reader The XML reader.
 * @return The Probability, or NULL in case of error.
 */
static struct Clue_Solver_Rest_ns0_probability *xmlTextReaderReadNs0ProbabilityType(xmlTextReaderPtr reader);

/**
 * Writes a Probability to XML.
 *
 * @param writer The XML writer.
 * @param _probability The Probability to write.
 * @return The bytes written (may be 0 in case of buffering) or -1 in case of error.
 */
static int xmlTextWriterWriteNs0ProbabilityType(xmlTextWriterPtr writer, struct Clue_Solver_Rest_ns0_probability *_probability);

/**
 * Frees the elements of a Probability.
 *
 * @param _probability The Probability to free.
 */
static void freeNs0ProbabilityType(struct Clue_Solver_Rest_ns0_probability *_probability);

#endif /* DEF_Clue_Solver_Rest_ns0_probability_H */
#ifndef DEF_Clue_Solver_Rest_ns0_room_H
#define DEF_Clue_Solver_Rest_ns0_room_H

/**
 * (no documentation provided)
 */
struct Clue_Solver_Rest_ns0_room {


  /**
   * (no documentation provided)
   */
  xmlChar *name;

  /**
   * (no documentation provided)
   */
  xmlChar *type;
};

/**
 * Reads a Room element from XML. The element to be read is "room", and
 * it is assumed that the reader is pointing to the XML document (not the element).
 *
 * @param reader The XML reader.
 * @return The Room, or NULL in case of error.
 */
struct Clue_Solver_Rest_ns0_room *xml_read_Clue_Solver_Rest_ns0_room(xmlTextReaderPtr reader);

/**
 * Writes a Room to XML under element name "room".
 *
 * @param writer The XML writer.
 * @param _room The Room to write.
 * @return The bytes written (may be 0 in case of buffering) or -1 in case of error.
 */
int xml_write_Clue_Solver_Rest_ns0_room(xmlTextWriterPtr writer, struct Clue_Solver_Rest_ns0_room *_room);

/**
 * Frees a Room.
 *
 * @param _room The Room to free.
 */
void free_Clue_Solver_Rest_ns0_room(struct Clue_Solver_Rest_ns0_room *_room);

/**
 * Reads a Room element from XML. The element to be read is "room", and
 * it is assumed that the reader is already pointing to the element.
 *
 * @param reader The XML reader.
 * @return The Room, or NULL in case of error.
 */
struct Clue_Solver_Rest_ns0_room *xmlTextReaderReadNs0RoomElement(xmlTextReaderPtr reader);

/**
 * Writes a Room to XML under element name "room".
 * Does NOT write the namespace prefixes.
 *
 * @param writer The XML writer.
 * @param _room The Room to write.
 * @return The bytes written (may be 0 in case of buffering) or -1 in case of error.
 */
static int xmlTextWriterWriteNs0RoomElement(xmlTextWriterPtr writer, struct Clue_Solver_Rest_ns0_room *_room);

/**
 * Writes a Room to XML under element name "room".
 *
 * @param writer The XML writer.
 * @param _room The Room to write.
 * @param writeNamespaces Whether to write the namespace prefixes.
 * @return The bytes written (may be 0 in case of buffering) or -1 in case of error.
 */
static int xmlTextWriterWriteNs0RoomElementNS(xmlTextWriterPtr writer, struct Clue_Solver_Rest_ns0_room *_room, int writeNamespaces);

/**
 * Frees the children of a Room.
 *
 * @param _room The Room whose children are to be free.
 */
static void freeNs0RoomElement(struct Clue_Solver_Rest_ns0_room *_room);

/**
 * Reads a Room from XML. The reader is assumed to be at the start element.
 *
 * @param reader The XML reader.
 * @return The Room, or NULL in case of error.
 */
static struct Clue_Solver_Rest_ns0_room *xmlTextReaderReadNs0RoomType(xmlTextReaderPtr reader);

/**
 * Writes a Room to XML.
 *
 * @param writer The XML writer.
 * @param _room The Room to write.
 * @return The bytes written (may be 0 in case of buffering) or -1 in case of error.
 */
static int xmlTextWriterWriteNs0RoomType(xmlTextWriterPtr writer, struct Clue_Solver_Rest_ns0_room *_room);

/**
 * Frees the elements of a Room.
 *
 * @param _room The Room to free.
 */
static void freeNs0RoomType(struct Clue_Solver_Rest_ns0_room *_room);

#endif /* DEF_Clue_Solver_Rest_ns0_room_H */
#ifndef DEF_Clue_Solver_Rest_ns0_suspect_H
#define DEF_Clue_Solver_Rest_ns0_suspect_H

/**
 * (no documentation provided)
 */
struct Clue_Solver_Rest_ns0_suspect {


  /**
   * (no documentation provided)
   */
  xmlChar *name;

  /**
   * (no documentation provided)
   */
  xmlChar *type;
};

/**
 * Reads a Suspect element from XML. The element to be read is "suspect", and
 * it is assumed that the reader is pointing to the XML document (not the element).
 *
 * @param reader The XML reader.
 * @return The Suspect, or NULL in case of error.
 */
struct Clue_Solver_Rest_ns0_suspect *xml_read_Clue_Solver_Rest_ns0_suspect(xmlTextReaderPtr reader);

/**
 * Writes a Suspect to XML under element name "suspect".
 *
 * @param writer The XML writer.
 * @param _suspect The Suspect to write.
 * @return The bytes written (may be 0 in case of buffering) or -1 in case of error.
 */
int xml_write_Clue_Solver_Rest_ns0_suspect(xmlTextWriterPtr writer, struct Clue_Solver_Rest_ns0_suspect *_suspect);

/**
 * Frees a Suspect.
 *
 * @param _suspect The Suspect to free.
 */
void free_Clue_Solver_Rest_ns0_suspect(struct Clue_Solver_Rest_ns0_suspect *_suspect);

/**
 * Reads a Suspect element from XML. The element to be read is "suspect", and
 * it is assumed that the reader is already pointing to the element.
 *
 * @param reader The XML reader.
 * @return The Suspect, or NULL in case of error.
 */
struct Clue_Solver_Rest_ns0_suspect *xmlTextReaderReadNs0SuspectElement(xmlTextReaderPtr reader);

/**
 * Writes a Suspect to XML under element name "suspect".
 * Does NOT write the namespace prefixes.
 *
 * @param writer The XML writer.
 * @param _suspect The Suspect to write.
 * @return The bytes written (may be 0 in case of buffering) or -1 in case of error.
 */
static int xmlTextWriterWriteNs0SuspectElement(xmlTextWriterPtr writer, struct Clue_Solver_Rest_ns0_suspect *_suspect);

/**
 * Writes a Suspect to XML under element name "suspect".
 *
 * @param writer The XML writer.
 * @param _suspect The Suspect to write.
 * @param writeNamespaces Whether to write the namespace prefixes.
 * @return The bytes written (may be 0 in case of buffering) or -1 in case of error.
 */
static int xmlTextWriterWriteNs0SuspectElementNS(xmlTextWriterPtr writer, struct Clue_Solver_Rest_ns0_suspect *_suspect, int writeNamespaces);

/**
 * Frees the children of a Suspect.
 *
 * @param _suspect The Suspect whose children are to be free.
 */
static void freeNs0SuspectElement(struct Clue_Solver_Rest_ns0_suspect *_suspect);

/**
 * Reads a Suspect from XML. The reader is assumed to be at the start element.
 *
 * @param reader The XML reader.
 * @return The Suspect, or NULL in case of error.
 */
static struct Clue_Solver_Rest_ns0_suspect *xmlTextReaderReadNs0SuspectType(xmlTextReaderPtr reader);

/**
 * Writes a Suspect to XML.
 *
 * @param writer The XML writer.
 * @param _suspect The Suspect to write.
 * @return The bytes written (may be 0 in case of buffering) or -1 in case of error.
 */
static int xmlTextWriterWriteNs0SuspectType(xmlTextWriterPtr writer, struct Clue_Solver_Rest_ns0_suspect *_suspect);

/**
 * Frees the elements of a Suspect.
 *
 * @param _suspect The Suspect to free.
 */
static void freeNs0SuspectType(struct Clue_Solver_Rest_ns0_suspect *_suspect);

#endif /* DEF_Clue_Solver_Rest_ns0_suspect_H */
#ifndef DEF_Clue_Solver_Rest_ns0_triple_H
#define DEF_Clue_Solver_Rest_ns0_triple_H

/**
 * (no documentation provided)
 */
struct Clue_Solver_Rest_ns0_triple {


  /**
   * (no documentation provided)
   */
  struct Clue_Solver_Rest_ns0_suspect *suspect;

  /**
   * (no documentation provided)
   */
  struct Clue_Solver_Rest_ns0_room *room;

  /**
   * (no documentation provided)
   */
  struct Clue_Solver_Rest_ns0_weapon *weapon;
};

/**
 * Reads a Triple element from XML. The element to be read is "triple", and
 * it is assumed that the reader is pointing to the XML document (not the element).
 *
 * @param reader The XML reader.
 * @return The Triple, or NULL in case of error.
 */
struct Clue_Solver_Rest_ns0_triple *xml_read_Clue_Solver_Rest_ns0_triple(xmlTextReaderPtr reader);

/**
 * Writes a Triple to XML under element name "triple".
 *
 * @param writer The XML writer.
 * @param _triple The Triple to write.
 * @return The bytes written (may be 0 in case of buffering) or -1 in case of error.
 */
int xml_write_Clue_Solver_Rest_ns0_triple(xmlTextWriterPtr writer, struct Clue_Solver_Rest_ns0_triple *_triple);

/**
 * Frees a Triple.
 *
 * @param _triple The Triple to free.
 */
void free_Clue_Solver_Rest_ns0_triple(struct Clue_Solver_Rest_ns0_triple *_triple);

/**
 * Reads a Triple element from XML. The element to be read is "triple", and
 * it is assumed that the reader is already pointing to the element.
 *
 * @param reader The XML reader.
 * @return The Triple, or NULL in case of error.
 */
struct Clue_Solver_Rest_ns0_triple *xmlTextReaderReadNs0TripleElement(xmlTextReaderPtr reader);

/**
 * Writes a Triple to XML under element name "triple".
 * Does NOT write the namespace prefixes.
 *
 * @param writer The XML writer.
 * @param _triple The Triple to write.
 * @return The bytes written (may be 0 in case of buffering) or -1 in case of error.
 */
static int xmlTextWriterWriteNs0TripleElement(xmlTextWriterPtr writer, struct Clue_Solver_Rest_ns0_triple *_triple);

/**
 * Writes a Triple to XML under element name "triple".
 *
 * @param writer The XML writer.
 * @param _triple The Triple to write.
 * @param writeNamespaces Whether to write the namespace prefixes.
 * @return The bytes written (may be 0 in case of buffering) or -1 in case of error.
 */
static int xmlTextWriterWriteNs0TripleElementNS(xmlTextWriterPtr writer, struct Clue_Solver_Rest_ns0_triple *_triple, int writeNamespaces);

/**
 * Frees the children of a Triple.
 *
 * @param _triple The Triple whose children are to be free.
 */
static void freeNs0TripleElement(struct Clue_Solver_Rest_ns0_triple *_triple);

/**
 * Reads a Triple from XML. The reader is assumed to be at the start element.
 *
 * @param reader The XML reader.
 * @return The Triple, or NULL in case of error.
 */
static struct Clue_Solver_Rest_ns0_triple *xmlTextReaderReadNs0TripleType(xmlTextReaderPtr reader);

/**
 * Writes a Triple to XML.
 *
 * @param writer The XML writer.
 * @param _triple The Triple to write.
 * @return The bytes written (may be 0 in case of buffering) or -1 in case of error.
 */
static int xmlTextWriterWriteNs0TripleType(xmlTextWriterPtr writer, struct Clue_Solver_Rest_ns0_triple *_triple);

/**
 * Frees the elements of a Triple.
 *
 * @param _triple The Triple to free.
 */
static void freeNs0TripleType(struct Clue_Solver_Rest_ns0_triple *_triple);

#endif /* DEF_Clue_Solver_Rest_ns0_triple_H */
#ifndef DEF_Clue_Solver_Rest_ns0_weapon_H
#define DEF_Clue_Solver_Rest_ns0_weapon_H

/**
 * (no documentation provided)
 */
struct Clue_Solver_Rest_ns0_weapon {


  /**
   * (no documentation provided)
   */
  xmlChar *name;

  /**
   * (no documentation provided)
   */
  xmlChar *type;
};

/**
 * Reads a Weapon element from XML. The element to be read is "weapon", and
 * it is assumed that the reader is pointing to the XML document (not the element).
 *
 * @param reader The XML reader.
 * @return The Weapon, or NULL in case of error.
 */
struct Clue_Solver_Rest_ns0_weapon *xml_read_Clue_Solver_Rest_ns0_weapon(xmlTextReaderPtr reader);

/**
 * Writes a Weapon to XML under element name "weapon".
 *
 * @param writer The XML writer.
 * @param _weapon The Weapon to write.
 * @return The bytes written (may be 0 in case of buffering) or -1 in case of error.
 */
int xml_write_Clue_Solver_Rest_ns0_weapon(xmlTextWriterPtr writer, struct Clue_Solver_Rest_ns0_weapon *_weapon);

/**
 * Frees a Weapon.
 *
 * @param _weapon The Weapon to free.
 */
void free_Clue_Solver_Rest_ns0_weapon(struct Clue_Solver_Rest_ns0_weapon *_weapon);

/**
 * Reads a Weapon element from XML. The element to be read is "weapon", and
 * it is assumed that the reader is already pointing to the element.
 *
 * @param reader The XML reader.
 * @return The Weapon, or NULL in case of error.
 */
struct Clue_Solver_Rest_ns0_weapon *xmlTextReaderReadNs0WeaponElement(xmlTextReaderPtr reader);

/**
 * Writes a Weapon to XML under element name "weapon".
 * Does NOT write the namespace prefixes.
 *
 * @param writer The XML writer.
 * @param _weapon The Weapon to write.
 * @return The bytes written (may be 0 in case of buffering) or -1 in case of error.
 */
static int xmlTextWriterWriteNs0WeaponElement(xmlTextWriterPtr writer, struct Clue_Solver_Rest_ns0_weapon *_weapon);

/**
 * Writes a Weapon to XML under element name "weapon".
 *
 * @param writer The XML writer.
 * @param _weapon The Weapon to write.
 * @param writeNamespaces Whether to write the namespace prefixes.
 * @return The bytes written (may be 0 in case of buffering) or -1 in case of error.
 */
static int xmlTextWriterWriteNs0WeaponElementNS(xmlTextWriterPtr writer, struct Clue_Solver_Rest_ns0_weapon *_weapon, int writeNamespaces);

/**
 * Frees the children of a Weapon.
 *
 * @param _weapon The Weapon whose children are to be free.
 */
static void freeNs0WeaponElement(struct Clue_Solver_Rest_ns0_weapon *_weapon);

/**
 * Reads a Weapon from XML. The reader is assumed to be at the start element.
 *
 * @param reader The XML reader.
 * @return The Weapon, or NULL in case of error.
 */
static struct Clue_Solver_Rest_ns0_weapon *xmlTextReaderReadNs0WeaponType(xmlTextReaderPtr reader);

/**
 * Writes a Weapon to XML.
 *
 * @param writer The XML writer.
 * @param _weapon The Weapon to write.
 * @return The bytes written (may be 0 in case of buffering) or -1 in case of error.
 */
static int xmlTextWriterWriteNs0WeaponType(xmlTextWriterPtr writer, struct Clue_Solver_Rest_ns0_weapon *_weapon);

/**
 * Frees the elements of a Weapon.
 *
 * @param _weapon The Weapon to free.
 */
static void freeNs0WeaponType(struct Clue_Solver_Rest_ns0_weapon *_weapon);

#endif /* DEF_Clue_Solver_Rest_ns0_weapon_H */
#ifndef DEF_Clue_Solver_Rest_ns0_clueServerStatus_H
#define DEF_Clue_Solver_Rest_ns0_clueServerStatus_H

/**
 * (no documentation provided)
 */
struct Clue_Solver_Rest_ns0_clueServerStatus {


  /**
   * (no documentation provided)
   */
  struct Clue_Solver_Rest_ns0_triple *remainingTriples;

  /**
   * Size of the remainingTriples array.
   */
  int _sizeof_remainingTriples;

  /**
   * (no documentation provided)
   */
  struct Clue_Solver_Rest_ns0_card *remainingCards;

  /**
   * Size of the remainingCards array.
   */
  int _sizeof_remainingCards;
};

/**
 * Reads a ClueServerStatus element from XML. The element to be read is "status", and
 * it is assumed that the reader is pointing to the XML document (not the element).
 *
 * @param reader The XML reader.
 * @return The ClueServerStatus, or NULL in case of error.
 */
struct Clue_Solver_Rest_ns0_clueServerStatus *xml_read_Clue_Solver_Rest_ns0_clueServerStatus(xmlTextReaderPtr reader);

/**
 * Writes a ClueServerStatus to XML under element name "status".
 *
 * @param writer The XML writer.
 * @param _clueServerStatus The ClueServerStatus to write.
 * @return The bytes written (may be 0 in case of buffering) or -1 in case of error.
 */
int xml_write_Clue_Solver_Rest_ns0_clueServerStatus(xmlTextWriterPtr writer, struct Clue_Solver_Rest_ns0_clueServerStatus *_clueServerStatus);

/**
 * Frees a ClueServerStatus.
 *
 * @param _clueServerStatus The ClueServerStatus to free.
 */
void free_Clue_Solver_Rest_ns0_clueServerStatus(struct Clue_Solver_Rest_ns0_clueServerStatus *_clueServerStatus);

/**
 * Reads a ClueServerStatus element from XML. The element to be read is "status", and
 * it is assumed that the reader is already pointing to the element.
 *
 * @param reader The XML reader.
 * @return The ClueServerStatus, or NULL in case of error.
 */
struct Clue_Solver_Rest_ns0_clueServerStatus *xmlTextReaderReadNs0StatusElement(xmlTextReaderPtr reader);

/**
 * Writes a ClueServerStatus to XML under element name "status".
 * Does NOT write the namespace prefixes.
 *
 * @param writer The XML writer.
 * @param _clueServerStatus The ClueServerStatus to write.
 * @return The bytes written (may be 0 in case of buffering) or -1 in case of error.
 */
static int xmlTextWriterWriteNs0StatusElement(xmlTextWriterPtr writer, struct Clue_Solver_Rest_ns0_clueServerStatus *_clueServerStatus);

/**
 * Writes a ClueServerStatus to XML under element name "status".
 *
 * @param writer The XML writer.
 * @param _clueServerStatus The ClueServerStatus to write.
 * @param writeNamespaces Whether to write the namespace prefixes.
 * @return The bytes written (may be 0 in case of buffering) or -1 in case of error.
 */
static int xmlTextWriterWriteNs0StatusElementNS(xmlTextWriterPtr writer, struct Clue_Solver_Rest_ns0_clueServerStatus *_clueServerStatus, int writeNamespaces);

/**
 * Frees the children of a ClueServerStatus.
 *
 * @param _clueServerStatus The ClueServerStatus whose children are to be free.
 */
static void freeNs0StatusElement(struct Clue_Solver_Rest_ns0_clueServerStatus *_clueServerStatus);

/**
 * Reads a ClueServerStatus from XML. The reader is assumed to be at the start element.
 *
 * @param reader The XML reader.
 * @return The ClueServerStatus, or NULL in case of error.
 */
static struct Clue_Solver_Rest_ns0_clueServerStatus *xmlTextReaderReadNs0ClueServerStatusType(xmlTextReaderPtr reader);

/**
 * Writes a ClueServerStatus to XML.
 *
 * @param writer The XML writer.
 * @param _clueServerStatus The ClueServerStatus to write.
 * @return The bytes written (may be 0 in case of buffering) or -1 in case of error.
 */
static int xmlTextWriterWriteNs0ClueServerStatusType(xmlTextWriterPtr writer, struct Clue_Solver_Rest_ns0_clueServerStatus *_clueServerStatus);

/**
 * Frees the elements of a ClueServerStatus.
 *
 * @param _clueServerStatus The ClueServerStatus to free.
 */
static void freeNs0ClueServerStatusType(struct Clue_Solver_Rest_ns0_clueServerStatus *_clueServerStatus);

#endif /* DEF_Clue_Solver_Rest_ns0_clueServerStatus_H */
#ifndef DEF_Clue_Solver_Rest_ns0_probabilityReport_H
#define DEF_Clue_Solver_Rest_ns0_probabilityReport_H

/**
 * (no documentation provided)
 */
struct Clue_Solver_Rest_ns0_probabilityReport {


  /**
   * (no documentation provided)
   */
  struct Clue_Solver_Rest_ns0_probability *rooms;

  /**
   * Size of the rooms array.
   */
  int _sizeof_rooms;

  /**
   * (no documentation provided)
   */
  struct Clue_Solver_Rest_ns0_probability *mostLikelyWeapon;

  /**
   * (no documentation provided)
   */
  struct Clue_Solver_Rest_ns0_probability *mostLikelyRoom;

  /**
   * (no documentation provided)
   */
  struct Clue_Solver_Rest_ns0_probability *weapons;

  /**
   * Size of the weapons array.
   */
  int _sizeof_weapons;

  /**
   * (no documentation provided)
   */
  struct Clue_Solver_Rest_ns0_probability *mostLikelyTriple;

  /**
   * (no documentation provided)
   */
  struct Clue_Solver_Rest_ns0_probability *mostLikelySuspect;

  /**
   * (no documentation provided)
   */
  struct Clue_Solver_Rest_ns0_probability *suspects;

  /**
   * Size of the suspects array.
   */
  int _sizeof_suspects;
};

/**
 * Reads a ProbabilityReport element from XML. The element to be read is "probabilityReport", and
 * it is assumed that the reader is pointing to the XML document (not the element).
 *
 * @param reader The XML reader.
 * @return The ProbabilityReport, or NULL in case of error.
 */
struct Clue_Solver_Rest_ns0_probabilityReport *xml_read_Clue_Solver_Rest_ns0_probabilityReport(xmlTextReaderPtr reader);

/**
 * Writes a ProbabilityReport to XML under element name "probabilityReport".
 *
 * @param writer The XML writer.
 * @param _probabilityReport The ProbabilityReport to write.
 * @return The bytes written (may be 0 in case of buffering) or -1 in case of error.
 */
int xml_write_Clue_Solver_Rest_ns0_probabilityReport(xmlTextWriterPtr writer, struct Clue_Solver_Rest_ns0_probabilityReport *_probabilityReport);

/**
 * Frees a ProbabilityReport.
 *
 * @param _probabilityReport The ProbabilityReport to free.
 */
void free_Clue_Solver_Rest_ns0_probabilityReport(struct Clue_Solver_Rest_ns0_probabilityReport *_probabilityReport);

/**
 * Reads a ProbabilityReport element from XML. The element to be read is "probabilityReport", and
 * it is assumed that the reader is already pointing to the element.
 *
 * @param reader The XML reader.
 * @return The ProbabilityReport, or NULL in case of error.
 */
struct Clue_Solver_Rest_ns0_probabilityReport *xmlTextReaderReadNs0ProbabilityReportElement(xmlTextReaderPtr reader);

/**
 * Writes a ProbabilityReport to XML under element name "probabilityReport".
 * Does NOT write the namespace prefixes.
 *
 * @param writer The XML writer.
 * @param _probabilityReport The ProbabilityReport to write.
 * @return The bytes written (may be 0 in case of buffering) or -1 in case of error.
 */
static int xmlTextWriterWriteNs0ProbabilityReportElement(xmlTextWriterPtr writer, struct Clue_Solver_Rest_ns0_probabilityReport *_probabilityReport);

/**
 * Writes a ProbabilityReport to XML under element name "probabilityReport".
 *
 * @param writer The XML writer.
 * @param _probabilityReport The ProbabilityReport to write.
 * @param writeNamespaces Whether to write the namespace prefixes.
 * @return The bytes written (may be 0 in case of buffering) or -1 in case of error.
 */
static int xmlTextWriterWriteNs0ProbabilityReportElementNS(xmlTextWriterPtr writer, struct Clue_Solver_Rest_ns0_probabilityReport *_probabilityReport, int writeNamespaces);

/**
 * Frees the children of a ProbabilityReport.
 *
 * @param _probabilityReport The ProbabilityReport whose children are to be free.
 */
static void freeNs0ProbabilityReportElement(struct Clue_Solver_Rest_ns0_probabilityReport *_probabilityReport);

/**
 * Reads a ProbabilityReport from XML. The reader is assumed to be at the start element.
 *
 * @param reader The XML reader.
 * @return The ProbabilityReport, or NULL in case of error.
 */
static struct Clue_Solver_Rest_ns0_probabilityReport *xmlTextReaderReadNs0ProbabilityReportType(xmlTextReaderPtr reader);

/**
 * Writes a ProbabilityReport to XML.
 *
 * @param writer The XML writer.
 * @param _probabilityReport The ProbabilityReport to write.
 * @return The bytes written (may be 0 in case of buffering) or -1 in case of error.
 */
static int xmlTextWriterWriteNs0ProbabilityReportType(xmlTextWriterPtr writer, struct Clue_Solver_Rest_ns0_probabilityReport *_probabilityReport);

/**
 * Frees the elements of a ProbabilityReport.
 *
 * @param _probabilityReport The ProbabilityReport to free.
 */
static void freeNs0ProbabilityReportType(struct Clue_Solver_Rest_ns0_probabilityReport *_probabilityReport);

#endif /* DEF_Clue_Solver_Rest_ns0_probabilityReport_H */
#ifndef DEF_Clue_Solver_Rest_ns0_card_M
#define DEF_Clue_Solver_Rest_ns0_card_M

/**
 * Reads a Card element from XML. The element to be read is "card", and
 * it is assumed that the reader is pointing to the XML document (not the element).
 *
 * @param reader The XML reader.
 * @return The Card, or NULL in case of error.
 */
struct Clue_Solver_Rest_ns0_card *xml_read_Clue_Solver_Rest_ns0_card(xmlTextReaderPtr reader) {
  int status = xmlTextReaderAdvanceToNextStartOrEndElement(reader);
  return xmlTextReaderReadNs0CardElement(reader);
}

/**
 * Writes a Card to XML under element name "card".
 *
 * @param writer The XML writer.
 * @param _card The Card to write.
 * @return 1 if successful, 0 otherwise.
 */
int xml_write_Clue_Solver_Rest_ns0_card(xmlTextWriterPtr writer, struct Clue_Solver_Rest_ns0_card *_card) {
  return xmlTextWriterWriteNs0CardElementNS(writer, _card, 1);
}

/**
 * Frees a Card.
 *
 * @param _card The Card to free.
 */
void free_Clue_Solver_Rest_ns0_card(struct Clue_Solver_Rest_ns0_card *_card) {
  freeNs0CardType(_card);
  free(_card);
}

/**
 * Reads a Card element from XML. The element to be read is "card", and
 * it is assumed that the reader is pointing to that element.
 *
 * @param reader The XML reader.
 * @return The Card, or NULL in case of error.
 */
struct Clue_Solver_Rest_ns0_card *xmlTextReaderReadNs0CardElement(xmlTextReaderPtr reader) {
  struct Clue_Solver_Rest_ns0_card *_card = NULL;

  if (xmlTextReaderNodeType(reader) == XML_READER_TYPE_ELEMENT
    && xmlStrcmp(BAD_CAST "card", xmlTextReaderConstLocalName(reader)) == 0
    && xmlTextReaderConstNamespaceUri(reader) == NULL) {
#if DEBUG_ENUNCIATE > 1
    printf("Attempting to read root element {}card.\n");
#endif
    _card = xmlTextReaderReadNs0CardType(reader);
  }
#if DEBUG_ENUNCIATE
  if (_card == NULL) {
    if (xmlTextReaderConstNamespaceUri(reader) == NULL) {
      printf("attempt to read {}card failed. current element: {}%s\n",  xmlTextReaderConstLocalName(reader));
    }
    else {
      printf("attempt to read {}card failed. current element: {%s}%s\n", xmlTextReaderConstNamespaceUri(reader), xmlTextReaderConstLocalName(reader));
    }
  }
#endif

  return _card;
}

/**
 * Writes a Card to XML under element name "card".
 * Does NOT write the namespace prefixes.
 *
 * @param writer The XML writer.
 * @param _card The Card to write.
 * @return 1 if successful, 0 otherwise.
 */
static int xmlTextWriterWriteNs0CardElement(xmlTextWriterPtr writer, struct Clue_Solver_Rest_ns0_card *_card) {
  return xmlTextWriterWriteNs0CardElementNS(writer, _card, 0);
}

/**
 * Writes a Card to XML under element name "card".
 *
 * @param writer The XML writer.
 * @param _card The Card to write.
 * @param writeNamespaces Whether to write the namespace prefixes.
 * @return 1 if successful, 0 otherwise.
 */
static int xmlTextWriterWriteNs0CardElementNS(xmlTextWriterPtr writer, struct Clue_Solver_Rest_ns0_card *_card, int writeNamespaces) {
  int totalBytes = 0;
  int status;

  status = xmlTextWriterStartElementNS(writer, NULL, BAD_CAST "card", NULL);
  if (status < 0) {
#if DEBUG_ENUNCIATE
    printf("unable to write start element {}card. status: %i\n", status);
#endif
    return status;
  }
  totalBytes += status;

#if DEBUG_ENUNCIATE > 1
  printf("writing type {}card for root element {}card...\n");
#endif
  status = xmlTextWriterWriteNs0CardType(writer, _card);
  if (status < 0) {
#if DEBUG_ENUNCIATE
    printf("unable to write type for start element {}card. status: %i\n", status);
#endif
    return status;
  }
  totalBytes += status;

  status = xmlTextWriterEndElement(writer);
  if (status < 0) {
#if DEBUG_ENUNCIATE
    printf("unable to end element {}card. status: %i\n", status);
#endif
    return status;
  }
  totalBytes += status;

  return totalBytes;
}

/**
 * Frees the children of a Card.
 *
 * @param _card The Card whose children are to be free.
 */
static void freeNs0CardElement(struct Clue_Solver_Rest_ns0_card *_card) {
  freeNs0CardType(_card);
}

/**
 * Reads a Card from XML. The reader is assumed to be at the start element.
 *
 * @return the Card, or NULL in case of error.
 */
static struct Clue_Solver_Rest_ns0_card *xmlTextReaderReadNs0CardType(xmlTextReaderPtr reader) {
  int status, depth;
  void *_child_accessor;
  struct Clue_Solver_Rest_ns0_card *_card = calloc(1, sizeof(struct Clue_Solver_Rest_ns0_card));

  if (xmlTextReaderHasAttributes(reader)) {
    while (xmlTextReaderMoveToNextAttribute(reader)) {
      if ((xmlStrcmp(BAD_CAST "name", xmlTextReaderConstLocalName(reader)) == 0) && (xmlTextReaderConstNamespaceUri(reader) == NULL)) {
#if DEBUG_ENUNCIATE > 1
        printf("Attempting to read type {http://www.w3.org/2001/XMLSchema}string from attribute {}name...\n");
#endif
        _child_accessor = xmlTextReaderReadXsStringType(reader);
        if (_child_accessor == NULL) {
          //panic: unable to return the attribute value for some reason.
#if DEBUG_ENUNCIATE
          printf("Failed to read attribute {}name of type {http://www.w3.org/2001/XMLSchema}string.\n");
#endif
          freeNs0CardType(_card);
          free(_card);
          return NULL;
        }
        _card->name = ((xmlChar*)_child_accessor);
        continue;
      }
      if ((xmlStrcmp(BAD_CAST "type", xmlTextReaderConstLocalName(reader)) == 0) && (xmlTextReaderConstNamespaceUri(reader) == NULL)) {
#if DEBUG_ENUNCIATE > 1
        printf("Attempting to read type {http://www.w3.org/2001/XMLSchema}string from attribute {}type...\n");
#endif
        _child_accessor = xmlTextReaderReadXsStringType(reader);
        if (_child_accessor == NULL) {
          //panic: unable to return the attribute value for some reason.
#if DEBUG_ENUNCIATE
          printf("Failed to read attribute {}type of type {http://www.w3.org/2001/XMLSchema}string.\n");
#endif
          freeNs0CardType(_card);
          free(_card);
          return NULL;
        }
        _card->type = ((xmlChar*)_child_accessor);
        continue;
      }
    }

    status = xmlTextReaderMoveToElement(reader);
    if (status < 1) {
      //panic: unable to return to the element node.
#if DEBUG_ENUNCIATE
      printf("Unable to return to element node from attributes.\n");
#endif
      freeNs0CardType(_card);
      free(_card);
      return NULL;
    }
  }



  return _card;
}

/**
 * Writes a Card to XML.
 *
 * @param writer The XML writer.
 * @param _card The Card to write.
 * @return The total bytes written, or -1 on error;
 */
static int xmlTextWriterWriteNs0CardType(xmlTextWriterPtr writer, struct Clue_Solver_Rest_ns0_card *_card) {
  int status, totalBytes = 0, i;
  xmlChar *binaryData;

  if (_card->name != NULL) {
    status = xmlTextWriterStartAttributeNS(writer, NULL, BAD_CAST "name", NULL);
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write start attribute {}name. status: %i\n", status);
#endif
      return status;
    }
    totalBytes += status;

#if DEBUG_ENUNCIATE > 1
    printf("writing type {http://www.w3.org/2001/XMLSchema}string for attribute {}name...\n");
#endif
    status = xmlTextWriterWriteXsStringType(writer, (_card->name));
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write type {http://www.w3.org/2001/XMLSchema}string for attribute {}name. status: %i", status);
#endif
      return status;
    }
    totalBytes += status;

    status = xmlTextWriterEndAttribute(writer);
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write end attribute {}name. status: %i", status);
#endif
      return status;
    }
    totalBytes += status;
  }

  if (_card->type != NULL) {
    status = xmlTextWriterStartAttributeNS(writer, NULL, BAD_CAST "type", NULL);
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write start attribute {}type. status: %i\n", status);
#endif
      return status;
    }
    totalBytes += status;

#if DEBUG_ENUNCIATE > 1
    printf("writing type {http://www.w3.org/2001/XMLSchema}string for attribute {}type...\n");
#endif
    status = xmlTextWriterWriteXsStringType(writer, (_card->type));
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write type {http://www.w3.org/2001/XMLSchema}string for attribute {}type. status: %i", status);
#endif
      return status;
    }
    totalBytes += status;

    status = xmlTextWriterEndAttribute(writer);
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write end attribute {}type. status: %i", status);
#endif
      return status;
    }
    totalBytes += status;
  }

  return totalBytes;
}

/**
 * Frees the elements of a Card.
 *
 * @param _card The Card to free.
 */
static void freeNs0CardType(struct Clue_Solver_Rest_ns0_card *_card) {
  int i;
  if (_card->name != NULL) {
#if DEBUG_ENUNCIATE > 1
    printf("Freeing type of accessor name of type Clue_Solver_Rest_ns0_card...\n");
#endif
    freeXsStringType(_card->name);
#if DEBUG_ENUNCIATE > 1
    printf("Freeing accessor name of type Clue_Solver_Rest_ns0_card...\n");
#endif
    free(_card->name);
  }
  if (_card->type != NULL) {
#if DEBUG_ENUNCIATE > 1
    printf("Freeing type of accessor type of type Clue_Solver_Rest_ns0_card...\n");
#endif
    freeXsStringType(_card->type);
#if DEBUG_ENUNCIATE > 1
    printf("Freeing accessor type of type Clue_Solver_Rest_ns0_card...\n");
#endif
    free(_card->type);
  }
}
#endif /* DEF_Clue_Solver_Rest_ns0_card_M */
#ifndef DEF_Clue_Solver_Rest_ns0_probability_M
#define DEF_Clue_Solver_Rest_ns0_probability_M

/**
 * Reads a Probability element from XML. The element to be read is "cardProbability", and
 * it is assumed that the reader is pointing to the XML document (not the element).
 *
 * @param reader The XML reader.
 * @return The Probability, or NULL in case of error.
 */
struct Clue_Solver_Rest_ns0_probability *xml_read_Clue_Solver_Rest_ns0_probability(xmlTextReaderPtr reader) {
  int status = xmlTextReaderAdvanceToNextStartOrEndElement(reader);
  return xmlTextReaderReadNs0CardProbabilityElement(reader);
}

/**
 * Writes a Probability to XML under element name "cardProbability".
 *
 * @param writer The XML writer.
 * @param _probability The Probability to write.
 * @return 1 if successful, 0 otherwise.
 */
int xml_write_Clue_Solver_Rest_ns0_probability(xmlTextWriterPtr writer, struct Clue_Solver_Rest_ns0_probability *_probability) {
  return xmlTextWriterWriteNs0CardProbabilityElementNS(writer, _probability, 1);
}

/**
 * Frees a Probability.
 *
 * @param _probability The Probability to free.
 */
void free_Clue_Solver_Rest_ns0_probability(struct Clue_Solver_Rest_ns0_probability *_probability) {
  freeNs0ProbabilityType(_probability);
  free(_probability);
}

/**
 * Reads a Probability element from XML. The element to be read is "cardProbability", and
 * it is assumed that the reader is pointing to that element.
 *
 * @param reader The XML reader.
 * @return The Probability, or NULL in case of error.
 */
struct Clue_Solver_Rest_ns0_probability *xmlTextReaderReadNs0CardProbabilityElement(xmlTextReaderPtr reader) {
  struct Clue_Solver_Rest_ns0_probability *_probability = NULL;

  if (xmlTextReaderNodeType(reader) == XML_READER_TYPE_ELEMENT
    && xmlStrcmp(BAD_CAST "cardProbability", xmlTextReaderConstLocalName(reader)) == 0
    && xmlTextReaderConstNamespaceUri(reader) == NULL) {
#if DEBUG_ENUNCIATE > 1
    printf("Attempting to read root element {}cardProbability.\n");
#endif
    _probability = xmlTextReaderReadNs0ProbabilityType(reader);
  }
#if DEBUG_ENUNCIATE
  if (_probability == NULL) {
    if (xmlTextReaderConstNamespaceUri(reader) == NULL) {
      printf("attempt to read {}cardProbability failed. current element: {}%s\n",  xmlTextReaderConstLocalName(reader));
    }
    else {
      printf("attempt to read {}cardProbability failed. current element: {%s}%s\n", xmlTextReaderConstNamespaceUri(reader), xmlTextReaderConstLocalName(reader));
    }
  }
#endif

  return _probability;
}

/**
 * Writes a Probability to XML under element name "cardProbability".
 * Does NOT write the namespace prefixes.
 *
 * @param writer The XML writer.
 * @param _probability The Probability to write.
 * @return 1 if successful, 0 otherwise.
 */
static int xmlTextWriterWriteNs0CardProbabilityElement(xmlTextWriterPtr writer, struct Clue_Solver_Rest_ns0_probability *_probability) {
  return xmlTextWriterWriteNs0CardProbabilityElementNS(writer, _probability, 0);
}

/**
 * Writes a Probability to XML under element name "cardProbability".
 *
 * @param writer The XML writer.
 * @param _probability The Probability to write.
 * @param writeNamespaces Whether to write the namespace prefixes.
 * @return 1 if successful, 0 otherwise.
 */
static int xmlTextWriterWriteNs0CardProbabilityElementNS(xmlTextWriterPtr writer, struct Clue_Solver_Rest_ns0_probability *_probability, int writeNamespaces) {
  int totalBytes = 0;
  int status;

  status = xmlTextWriterStartElementNS(writer, NULL, BAD_CAST "cardProbability", NULL);
  if (status < 0) {
#if DEBUG_ENUNCIATE
    printf("unable to write start element {}cardProbability. status: %i\n", status);
#endif
    return status;
  }
  totalBytes += status;

#if DEBUG_ENUNCIATE > 1
  printf("writing type {}probability for root element {}cardProbability...\n");
#endif
  status = xmlTextWriterWriteNs0ProbabilityType(writer, _probability);
  if (status < 0) {
#if DEBUG_ENUNCIATE
    printf("unable to write type for start element {}cardProbability. status: %i\n", status);
#endif
    return status;
  }
  totalBytes += status;

  status = xmlTextWriterEndElement(writer);
  if (status < 0) {
#if DEBUG_ENUNCIATE
    printf("unable to end element {}cardProbability. status: %i\n", status);
#endif
    return status;
  }
  totalBytes += status;

  return totalBytes;
}

/**
 * Frees the children of a Probability.
 *
 * @param _probability The Probability whose children are to be free.
 */
static void freeNs0CardProbabilityElement(struct Clue_Solver_Rest_ns0_probability *_probability) {
  freeNs0ProbabilityType(_probability);
}

/**
 * Reads a Probability from XML. The reader is assumed to be at the start element.
 *
 * @return the Probability, or NULL in case of error.
 */
static struct Clue_Solver_Rest_ns0_probability *xmlTextReaderReadNs0ProbabilityType(xmlTextReaderPtr reader) {
  int status, depth;
  void *_child_accessor;
  struct Clue_Solver_Rest_ns0_probability *_probability = calloc(1, sizeof(struct Clue_Solver_Rest_ns0_probability));

  if (xmlTextReaderHasAttributes(reader)) {
    while (xmlTextReaderMoveToNextAttribute(reader)) {
      if ((xmlStrcmp(BAD_CAST "chance", xmlTextReaderConstLocalName(reader)) == 0) && (xmlTextReaderConstNamespaceUri(reader) == NULL)) {
#if DEBUG_ENUNCIATE > 1
        printf("Attempting to read type {http://www.w3.org/2001/XMLSchema}double from attribute {}chance...\n");
#endif
        _child_accessor = xmlTextReaderReadXsDoubleType(reader);
        if (_child_accessor == NULL) {
          //panic: unable to return the attribute value for some reason.
#if DEBUG_ENUNCIATE
          printf("Failed to read attribute {}chance of type {http://www.w3.org/2001/XMLSchema}double.\n");
#endif
          freeNs0ProbabilityType(_probability);
          free(_probability);
          return NULL;
        }
        _probability->cardProbability = *((double*)_child_accessor);
        freeXsDoubleType((double*) _child_accessor);
        free(_child_accessor);
        continue;
      }
    }

    status = xmlTextReaderMoveToElement(reader);
    if (status < 1) {
      //panic: unable to return to the element node.
#if DEBUG_ENUNCIATE
      printf("Unable to return to element node from attributes.\n");
#endif
      freeNs0ProbabilityType(_probability);
      free(_probability);
      return NULL;
    }
  }


#if DEBUG_ENUNCIATE > 1
        printf("Attempting to read 'any' element.\n");
#endif
        _child_accessor = xmlTextReaderReadXsAnyTypeType(reader);
        if (_child_accessor == NULL) {
#if DEBUG_ENUNCIATE
          printf("Failed to read xml 'any' element for accessor wrappedObject.\n");
#endif
          //panic: unable to read the child element for some reason.
          freeNs0ProbabilityType(_probability);
          free(_probability);
          return NULL;
        }

        if (_probability->wrappedObject != NULL) {
          ((struct xmlBasicNode*)_child_accessor)->sibling = _probability->wrappedObject;
        }
        _probability->wrappedObject = ((struct xmlBasicNode*)_child_accessor);
        status = xmlTextReaderAdvanceToNextStartOrEndElement(reader);

  return _probability;
}

/**
 * Writes a Probability to XML.
 *
 * @param writer The XML writer.
 * @param _probability The Probability to write.
 * @return The total bytes written, or -1 on error;
 */
static int xmlTextWriterWriteNs0ProbabilityType(xmlTextWriterPtr writer, struct Clue_Solver_Rest_ns0_probability *_probability) {
  int status, totalBytes = 0, i;
  xmlChar *binaryData;
  struct xmlBasicNode *_next;

  if (1) { //always write the primitive attribute
    status = xmlTextWriterStartAttributeNS(writer, NULL, BAD_CAST "chance", NULL);
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write start attribute {}chance. status: %i\n", status);
#endif
      return status;
    }
    totalBytes += status;

#if DEBUG_ENUNCIATE > 1
    printf("writing type {http://www.w3.org/2001/XMLSchema}double for attribute {}chance...\n");
#endif
    status = xmlTextWriterWriteXsDoubleType(writer, &(_probability->cardProbability));
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write type {http://www.w3.org/2001/XMLSchema}double for attribute {}chance. status: %i", status);
#endif
      return status;
    }
    totalBytes += status;

    status = xmlTextWriterEndAttribute(writer);
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write end attribute {}chance. status: %i", status);
#endif
      return status;
    }
    totalBytes += status;
  }

  _next = _probability->wrappedObject;
  while (_next != NULL) {
    status = xmlTextWriterWriteXsAnyTypeType(writer, _next);
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write element {%s}%s. status: %i\n", _next->ns, _next->name, status);
#endif
      return status;
    }
    totalBytes += status;

    _next = _next->sibling;
  }

  return totalBytes;
}

/**
 * Frees the elements of a Probability.
 *
 * @param _probability The Probability to free.
 */
static void freeNs0ProbabilityType(struct Clue_Solver_Rest_ns0_probability *_probability) {
  int i;
  if (_probability->wrappedObject != NULL) {
#if DEBUG_ENUNCIATE > 1
    printf("Freeing type of accessor wrappedObject of type Clue_Solver_Rest_ns0_probability...\n");
#endif
    freeXsAnyTypeType(_probability->wrappedObject);
  }
}
#endif /* DEF_Clue_Solver_Rest_ns0_probability_M */
#ifndef DEF_Clue_Solver_Rest_ns0_room_M
#define DEF_Clue_Solver_Rest_ns0_room_M

/**
 * Reads a Room element from XML. The element to be read is "room", and
 * it is assumed that the reader is pointing to the XML document (not the element).
 *
 * @param reader The XML reader.
 * @return The Room, or NULL in case of error.
 */
struct Clue_Solver_Rest_ns0_room *xml_read_Clue_Solver_Rest_ns0_room(xmlTextReaderPtr reader) {
  int status = xmlTextReaderAdvanceToNextStartOrEndElement(reader);
  return xmlTextReaderReadNs0RoomElement(reader);
}

/**
 * Writes a Room to XML under element name "room".
 *
 * @param writer The XML writer.
 * @param _room The Room to write.
 * @return 1 if successful, 0 otherwise.
 */
int xml_write_Clue_Solver_Rest_ns0_room(xmlTextWriterPtr writer, struct Clue_Solver_Rest_ns0_room *_room) {
  return xmlTextWriterWriteNs0RoomElementNS(writer, _room, 1);
}

/**
 * Frees a Room.
 *
 * @param _room The Room to free.
 */
void free_Clue_Solver_Rest_ns0_room(struct Clue_Solver_Rest_ns0_room *_room) {
  freeNs0RoomType(_room);
  free(_room);
}

/**
 * Reads a Room element from XML. The element to be read is "room", and
 * it is assumed that the reader is pointing to that element.
 *
 * @param reader The XML reader.
 * @return The Room, or NULL in case of error.
 */
struct Clue_Solver_Rest_ns0_room *xmlTextReaderReadNs0RoomElement(xmlTextReaderPtr reader) {
  struct Clue_Solver_Rest_ns0_room *_room = NULL;

  if (xmlTextReaderNodeType(reader) == XML_READER_TYPE_ELEMENT
    && xmlStrcmp(BAD_CAST "room", xmlTextReaderConstLocalName(reader)) == 0
    && xmlTextReaderConstNamespaceUri(reader) == NULL) {
#if DEBUG_ENUNCIATE > 1
    printf("Attempting to read root element {}room.\n");
#endif
    _room = xmlTextReaderReadNs0RoomType(reader);
  }
#if DEBUG_ENUNCIATE
  if (_room == NULL) {
    if (xmlTextReaderConstNamespaceUri(reader) == NULL) {
      printf("attempt to read {}room failed. current element: {}%s\n",  xmlTextReaderConstLocalName(reader));
    }
    else {
      printf("attempt to read {}room failed. current element: {%s}%s\n", xmlTextReaderConstNamespaceUri(reader), xmlTextReaderConstLocalName(reader));
    }
  }
#endif

  return _room;
}

/**
 * Writes a Room to XML under element name "room".
 * Does NOT write the namespace prefixes.
 *
 * @param writer The XML writer.
 * @param _room The Room to write.
 * @return 1 if successful, 0 otherwise.
 */
static int xmlTextWriterWriteNs0RoomElement(xmlTextWriterPtr writer, struct Clue_Solver_Rest_ns0_room *_room) {
  return xmlTextWriterWriteNs0RoomElementNS(writer, _room, 0);
}

/**
 * Writes a Room to XML under element name "room".
 *
 * @param writer The XML writer.
 * @param _room The Room to write.
 * @param writeNamespaces Whether to write the namespace prefixes.
 * @return 1 if successful, 0 otherwise.
 */
static int xmlTextWriterWriteNs0RoomElementNS(xmlTextWriterPtr writer, struct Clue_Solver_Rest_ns0_room *_room, int writeNamespaces) {
  int totalBytes = 0;
  int status;

  status = xmlTextWriterStartElementNS(writer, NULL, BAD_CAST "room", NULL);
  if (status < 0) {
#if DEBUG_ENUNCIATE
    printf("unable to write start element {}room. status: %i\n", status);
#endif
    return status;
  }
  totalBytes += status;

#if DEBUG_ENUNCIATE > 1
  printf("writing type {}room for root element {}room...\n");
#endif
  status = xmlTextWriterWriteNs0RoomType(writer, _room);
  if (status < 0) {
#if DEBUG_ENUNCIATE
    printf("unable to write type for start element {}room. status: %i\n", status);
#endif
    return status;
  }
  totalBytes += status;

  status = xmlTextWriterEndElement(writer);
  if (status < 0) {
#if DEBUG_ENUNCIATE
    printf("unable to end element {}room. status: %i\n", status);
#endif
    return status;
  }
  totalBytes += status;

  return totalBytes;
}

/**
 * Frees the children of a Room.
 *
 * @param _room The Room whose children are to be free.
 */
static void freeNs0RoomElement(struct Clue_Solver_Rest_ns0_room *_room) {
  freeNs0RoomType(_room);
}

/**
 * Reads a Room from XML. The reader is assumed to be at the start element.
 *
 * @return the Room, or NULL in case of error.
 */
static struct Clue_Solver_Rest_ns0_room *xmlTextReaderReadNs0RoomType(xmlTextReaderPtr reader) {
  int status, depth;
  void *_child_accessor;
  struct Clue_Solver_Rest_ns0_room *_room = calloc(1, sizeof(struct Clue_Solver_Rest_ns0_room));

  if (xmlTextReaderHasAttributes(reader)) {
    while (xmlTextReaderMoveToNextAttribute(reader)) {
      if ((xmlStrcmp(BAD_CAST "name", xmlTextReaderConstLocalName(reader)) == 0) && (xmlTextReaderConstNamespaceUri(reader) == NULL)) {
#if DEBUG_ENUNCIATE > 1
        printf("Attempting to read type {http://www.w3.org/2001/XMLSchema}string from attribute {}name...\n");
#endif
        _child_accessor = xmlTextReaderReadXsStringType(reader);
        if (_child_accessor == NULL) {
          //panic: unable to return the attribute value for some reason.
#if DEBUG_ENUNCIATE
          printf("Failed to read attribute {}name of type {http://www.w3.org/2001/XMLSchema}string.\n");
#endif
          freeNs0RoomType(_room);
          free(_room);
          return NULL;
        }
        _room->name = ((xmlChar*)_child_accessor);
        continue;
      }
      if ((xmlStrcmp(BAD_CAST "type", xmlTextReaderConstLocalName(reader)) == 0) && (xmlTextReaderConstNamespaceUri(reader) == NULL)) {
#if DEBUG_ENUNCIATE > 1
        printf("Attempting to read type {http://www.w3.org/2001/XMLSchema}string from attribute {}type...\n");
#endif
        _child_accessor = xmlTextReaderReadXsStringType(reader);
        if (_child_accessor == NULL) {
          //panic: unable to return the attribute value for some reason.
#if DEBUG_ENUNCIATE
          printf("Failed to read attribute {}type of type {http://www.w3.org/2001/XMLSchema}string.\n");
#endif
          freeNs0RoomType(_room);
          free(_room);
          return NULL;
        }
        _room->type = ((xmlChar*)_child_accessor);
        continue;
      }
    }

    status = xmlTextReaderMoveToElement(reader);
    if (status < 1) {
      //panic: unable to return to the element node.
#if DEBUG_ENUNCIATE
      printf("Unable to return to element node from attributes.\n");
#endif
      freeNs0RoomType(_room);
      free(_room);
      return NULL;
    }
  }



  return _room;
}

/**
 * Writes a Room to XML.
 *
 * @param writer The XML writer.
 * @param _room The Room to write.
 * @return The total bytes written, or -1 on error;
 */
static int xmlTextWriterWriteNs0RoomType(xmlTextWriterPtr writer, struct Clue_Solver_Rest_ns0_room *_room) {
  int status, totalBytes = 0, i;
  xmlChar *binaryData;

  if (_room->name != NULL) {
    status = xmlTextWriterStartAttributeNS(writer, NULL, BAD_CAST "name", NULL);
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write start attribute {}name. status: %i\n", status);
#endif
      return status;
    }
    totalBytes += status;

#if DEBUG_ENUNCIATE > 1
    printf("writing type {http://www.w3.org/2001/XMLSchema}string for attribute {}name...\n");
#endif
    status = xmlTextWriterWriteXsStringType(writer, (_room->name));
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write type {http://www.w3.org/2001/XMLSchema}string for attribute {}name. status: %i", status);
#endif
      return status;
    }
    totalBytes += status;

    status = xmlTextWriterEndAttribute(writer);
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write end attribute {}name. status: %i", status);
#endif
      return status;
    }
    totalBytes += status;
  }

  if (_room->type != NULL) {
    status = xmlTextWriterStartAttributeNS(writer, NULL, BAD_CAST "type", NULL);
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write start attribute {}type. status: %i\n", status);
#endif
      return status;
    }
    totalBytes += status;

#if DEBUG_ENUNCIATE > 1
    printf("writing type {http://www.w3.org/2001/XMLSchema}string for attribute {}type...\n");
#endif
    status = xmlTextWriterWriteXsStringType(writer, (_room->type));
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write type {http://www.w3.org/2001/XMLSchema}string for attribute {}type. status: %i", status);
#endif
      return status;
    }
    totalBytes += status;

    status = xmlTextWriterEndAttribute(writer);
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write end attribute {}type. status: %i", status);
#endif
      return status;
    }
    totalBytes += status;
  }

  return totalBytes;
}

/**
 * Frees the elements of a Room.
 *
 * @param _room The Room to free.
 */
static void freeNs0RoomType(struct Clue_Solver_Rest_ns0_room *_room) {
  int i;
  if (_room->name != NULL) {
#if DEBUG_ENUNCIATE > 1
    printf("Freeing type of accessor name of type Clue_Solver_Rest_ns0_room...\n");
#endif
    freeXsStringType(_room->name);
#if DEBUG_ENUNCIATE > 1
    printf("Freeing accessor name of type Clue_Solver_Rest_ns0_room...\n");
#endif
    free(_room->name);
  }
  if (_room->type != NULL) {
#if DEBUG_ENUNCIATE > 1
    printf("Freeing type of accessor type of type Clue_Solver_Rest_ns0_room...\n");
#endif
    freeXsStringType(_room->type);
#if DEBUG_ENUNCIATE > 1
    printf("Freeing accessor type of type Clue_Solver_Rest_ns0_room...\n");
#endif
    free(_room->type);
  }
}
#endif /* DEF_Clue_Solver_Rest_ns0_room_M */
#ifndef DEF_Clue_Solver_Rest_ns0_suspect_M
#define DEF_Clue_Solver_Rest_ns0_suspect_M

/**
 * Reads a Suspect element from XML. The element to be read is "suspect", and
 * it is assumed that the reader is pointing to the XML document (not the element).
 *
 * @param reader The XML reader.
 * @return The Suspect, or NULL in case of error.
 */
struct Clue_Solver_Rest_ns0_suspect *xml_read_Clue_Solver_Rest_ns0_suspect(xmlTextReaderPtr reader) {
  int status = xmlTextReaderAdvanceToNextStartOrEndElement(reader);
  return xmlTextReaderReadNs0SuspectElement(reader);
}

/**
 * Writes a Suspect to XML under element name "suspect".
 *
 * @param writer The XML writer.
 * @param _suspect The Suspect to write.
 * @return 1 if successful, 0 otherwise.
 */
int xml_write_Clue_Solver_Rest_ns0_suspect(xmlTextWriterPtr writer, struct Clue_Solver_Rest_ns0_suspect *_suspect) {
  return xmlTextWriterWriteNs0SuspectElementNS(writer, _suspect, 1);
}

/**
 * Frees a Suspect.
 *
 * @param _suspect The Suspect to free.
 */
void free_Clue_Solver_Rest_ns0_suspect(struct Clue_Solver_Rest_ns0_suspect *_suspect) {
  freeNs0SuspectType(_suspect);
  free(_suspect);
}

/**
 * Reads a Suspect element from XML. The element to be read is "suspect", and
 * it is assumed that the reader is pointing to that element.
 *
 * @param reader The XML reader.
 * @return The Suspect, or NULL in case of error.
 */
struct Clue_Solver_Rest_ns0_suspect *xmlTextReaderReadNs0SuspectElement(xmlTextReaderPtr reader) {
  struct Clue_Solver_Rest_ns0_suspect *_suspect = NULL;

  if (xmlTextReaderNodeType(reader) == XML_READER_TYPE_ELEMENT
    && xmlStrcmp(BAD_CAST "suspect", xmlTextReaderConstLocalName(reader)) == 0
    && xmlTextReaderConstNamespaceUri(reader) == NULL) {
#if DEBUG_ENUNCIATE > 1
    printf("Attempting to read root element {}suspect.\n");
#endif
    _suspect = xmlTextReaderReadNs0SuspectType(reader);
  }
#if DEBUG_ENUNCIATE
  if (_suspect == NULL) {
    if (xmlTextReaderConstNamespaceUri(reader) == NULL) {
      printf("attempt to read {}suspect failed. current element: {}%s\n",  xmlTextReaderConstLocalName(reader));
    }
    else {
      printf("attempt to read {}suspect failed. current element: {%s}%s\n", xmlTextReaderConstNamespaceUri(reader), xmlTextReaderConstLocalName(reader));
    }
  }
#endif

  return _suspect;
}

/**
 * Writes a Suspect to XML under element name "suspect".
 * Does NOT write the namespace prefixes.
 *
 * @param writer The XML writer.
 * @param _suspect The Suspect to write.
 * @return 1 if successful, 0 otherwise.
 */
static int xmlTextWriterWriteNs0SuspectElement(xmlTextWriterPtr writer, struct Clue_Solver_Rest_ns0_suspect *_suspect) {
  return xmlTextWriterWriteNs0SuspectElementNS(writer, _suspect, 0);
}

/**
 * Writes a Suspect to XML under element name "suspect".
 *
 * @param writer The XML writer.
 * @param _suspect The Suspect to write.
 * @param writeNamespaces Whether to write the namespace prefixes.
 * @return 1 if successful, 0 otherwise.
 */
static int xmlTextWriterWriteNs0SuspectElementNS(xmlTextWriterPtr writer, struct Clue_Solver_Rest_ns0_suspect *_suspect, int writeNamespaces) {
  int totalBytes = 0;
  int status;

  status = xmlTextWriterStartElementNS(writer, NULL, BAD_CAST "suspect", NULL);
  if (status < 0) {
#if DEBUG_ENUNCIATE
    printf("unable to write start element {}suspect. status: %i\n", status);
#endif
    return status;
  }
  totalBytes += status;

#if DEBUG_ENUNCIATE > 1
  printf("writing type {}suspect for root element {}suspect...\n");
#endif
  status = xmlTextWriterWriteNs0SuspectType(writer, _suspect);
  if (status < 0) {
#if DEBUG_ENUNCIATE
    printf("unable to write type for start element {}suspect. status: %i\n", status);
#endif
    return status;
  }
  totalBytes += status;

  status = xmlTextWriterEndElement(writer);
  if (status < 0) {
#if DEBUG_ENUNCIATE
    printf("unable to end element {}suspect. status: %i\n", status);
#endif
    return status;
  }
  totalBytes += status;

  return totalBytes;
}

/**
 * Frees the children of a Suspect.
 *
 * @param _suspect The Suspect whose children are to be free.
 */
static void freeNs0SuspectElement(struct Clue_Solver_Rest_ns0_suspect *_suspect) {
  freeNs0SuspectType(_suspect);
}

/**
 * Reads a Suspect from XML. The reader is assumed to be at the start element.
 *
 * @return the Suspect, or NULL in case of error.
 */
static struct Clue_Solver_Rest_ns0_suspect *xmlTextReaderReadNs0SuspectType(xmlTextReaderPtr reader) {
  int status, depth;
  void *_child_accessor;
  struct Clue_Solver_Rest_ns0_suspect *_suspect = calloc(1, sizeof(struct Clue_Solver_Rest_ns0_suspect));

  if (xmlTextReaderHasAttributes(reader)) {
    while (xmlTextReaderMoveToNextAttribute(reader)) {
      if ((xmlStrcmp(BAD_CAST "name", xmlTextReaderConstLocalName(reader)) == 0) && (xmlTextReaderConstNamespaceUri(reader) == NULL)) {
#if DEBUG_ENUNCIATE > 1
        printf("Attempting to read type {http://www.w3.org/2001/XMLSchema}string from attribute {}name...\n");
#endif
        _child_accessor = xmlTextReaderReadXsStringType(reader);
        if (_child_accessor == NULL) {
          //panic: unable to return the attribute value for some reason.
#if DEBUG_ENUNCIATE
          printf("Failed to read attribute {}name of type {http://www.w3.org/2001/XMLSchema}string.\n");
#endif
          freeNs0SuspectType(_suspect);
          free(_suspect);
          return NULL;
        }
        _suspect->name = ((xmlChar*)_child_accessor);
        continue;
      }
      if ((xmlStrcmp(BAD_CAST "type", xmlTextReaderConstLocalName(reader)) == 0) && (xmlTextReaderConstNamespaceUri(reader) == NULL)) {
#if DEBUG_ENUNCIATE > 1
        printf("Attempting to read type {http://www.w3.org/2001/XMLSchema}string from attribute {}type...\n");
#endif
        _child_accessor = xmlTextReaderReadXsStringType(reader);
        if (_child_accessor == NULL) {
          //panic: unable to return the attribute value for some reason.
#if DEBUG_ENUNCIATE
          printf("Failed to read attribute {}type of type {http://www.w3.org/2001/XMLSchema}string.\n");
#endif
          freeNs0SuspectType(_suspect);
          free(_suspect);
          return NULL;
        }
        _suspect->type = ((xmlChar*)_child_accessor);
        continue;
      }
    }

    status = xmlTextReaderMoveToElement(reader);
    if (status < 1) {
      //panic: unable to return to the element node.
#if DEBUG_ENUNCIATE
      printf("Unable to return to element node from attributes.\n");
#endif
      freeNs0SuspectType(_suspect);
      free(_suspect);
      return NULL;
    }
  }



  return _suspect;
}

/**
 * Writes a Suspect to XML.
 *
 * @param writer The XML writer.
 * @param _suspect The Suspect to write.
 * @return The total bytes written, or -1 on error;
 */
static int xmlTextWriterWriteNs0SuspectType(xmlTextWriterPtr writer, struct Clue_Solver_Rest_ns0_suspect *_suspect) {
  int status, totalBytes = 0, i;
  xmlChar *binaryData;

  if (_suspect->name != NULL) {
    status = xmlTextWriterStartAttributeNS(writer, NULL, BAD_CAST "name", NULL);
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write start attribute {}name. status: %i\n", status);
#endif
      return status;
    }
    totalBytes += status;

#if DEBUG_ENUNCIATE > 1
    printf("writing type {http://www.w3.org/2001/XMLSchema}string for attribute {}name...\n");
#endif
    status = xmlTextWriterWriteXsStringType(writer, (_suspect->name));
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write type {http://www.w3.org/2001/XMLSchema}string for attribute {}name. status: %i", status);
#endif
      return status;
    }
    totalBytes += status;

    status = xmlTextWriterEndAttribute(writer);
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write end attribute {}name. status: %i", status);
#endif
      return status;
    }
    totalBytes += status;
  }

  if (_suspect->type != NULL) {
    status = xmlTextWriterStartAttributeNS(writer, NULL, BAD_CAST "type", NULL);
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write start attribute {}type. status: %i\n", status);
#endif
      return status;
    }
    totalBytes += status;

#if DEBUG_ENUNCIATE > 1
    printf("writing type {http://www.w3.org/2001/XMLSchema}string for attribute {}type...\n");
#endif
    status = xmlTextWriterWriteXsStringType(writer, (_suspect->type));
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write type {http://www.w3.org/2001/XMLSchema}string for attribute {}type. status: %i", status);
#endif
      return status;
    }
    totalBytes += status;

    status = xmlTextWriterEndAttribute(writer);
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write end attribute {}type. status: %i", status);
#endif
      return status;
    }
    totalBytes += status;
  }

  return totalBytes;
}

/**
 * Frees the elements of a Suspect.
 *
 * @param _suspect The Suspect to free.
 */
static void freeNs0SuspectType(struct Clue_Solver_Rest_ns0_suspect *_suspect) {
  int i;
  if (_suspect->name != NULL) {
#if DEBUG_ENUNCIATE > 1
    printf("Freeing type of accessor name of type Clue_Solver_Rest_ns0_suspect...\n");
#endif
    freeXsStringType(_suspect->name);
#if DEBUG_ENUNCIATE > 1
    printf("Freeing accessor name of type Clue_Solver_Rest_ns0_suspect...\n");
#endif
    free(_suspect->name);
  }
  if (_suspect->type != NULL) {
#if DEBUG_ENUNCIATE > 1
    printf("Freeing type of accessor type of type Clue_Solver_Rest_ns0_suspect...\n");
#endif
    freeXsStringType(_suspect->type);
#if DEBUG_ENUNCIATE > 1
    printf("Freeing accessor type of type Clue_Solver_Rest_ns0_suspect...\n");
#endif
    free(_suspect->type);
  }
}
#endif /* DEF_Clue_Solver_Rest_ns0_suspect_M */
#ifndef DEF_Clue_Solver_Rest_ns0_triple_M
#define DEF_Clue_Solver_Rest_ns0_triple_M

/**
 * Reads a Triple element from XML. The element to be read is "triple", and
 * it is assumed that the reader is pointing to the XML document (not the element).
 *
 * @param reader The XML reader.
 * @return The Triple, or NULL in case of error.
 */
struct Clue_Solver_Rest_ns0_triple *xml_read_Clue_Solver_Rest_ns0_triple(xmlTextReaderPtr reader) {
  int status = xmlTextReaderAdvanceToNextStartOrEndElement(reader);
  return xmlTextReaderReadNs0TripleElement(reader);
}

/**
 * Writes a Triple to XML under element name "triple".
 *
 * @param writer The XML writer.
 * @param _triple The Triple to write.
 * @return 1 if successful, 0 otherwise.
 */
int xml_write_Clue_Solver_Rest_ns0_triple(xmlTextWriterPtr writer, struct Clue_Solver_Rest_ns0_triple *_triple) {
  return xmlTextWriterWriteNs0TripleElementNS(writer, _triple, 1);
}

/**
 * Frees a Triple.
 *
 * @param _triple The Triple to free.
 */
void free_Clue_Solver_Rest_ns0_triple(struct Clue_Solver_Rest_ns0_triple *_triple) {
  freeNs0TripleType(_triple);
  free(_triple);
}

/**
 * Reads a Triple element from XML. The element to be read is "triple", and
 * it is assumed that the reader is pointing to that element.
 *
 * @param reader The XML reader.
 * @return The Triple, or NULL in case of error.
 */
struct Clue_Solver_Rest_ns0_triple *xmlTextReaderReadNs0TripleElement(xmlTextReaderPtr reader) {
  struct Clue_Solver_Rest_ns0_triple *_triple = NULL;

  if (xmlTextReaderNodeType(reader) == XML_READER_TYPE_ELEMENT
    && xmlStrcmp(BAD_CAST "triple", xmlTextReaderConstLocalName(reader)) == 0
    && xmlTextReaderConstNamespaceUri(reader) == NULL) {
#if DEBUG_ENUNCIATE > 1
    printf("Attempting to read root element {}triple.\n");
#endif
    _triple = xmlTextReaderReadNs0TripleType(reader);
  }
#if DEBUG_ENUNCIATE
  if (_triple == NULL) {
    if (xmlTextReaderConstNamespaceUri(reader) == NULL) {
      printf("attempt to read {}triple failed. current element: {}%s\n",  xmlTextReaderConstLocalName(reader));
    }
    else {
      printf("attempt to read {}triple failed. current element: {%s}%s\n", xmlTextReaderConstNamespaceUri(reader), xmlTextReaderConstLocalName(reader));
    }
  }
#endif

  return _triple;
}

/**
 * Writes a Triple to XML under element name "triple".
 * Does NOT write the namespace prefixes.
 *
 * @param writer The XML writer.
 * @param _triple The Triple to write.
 * @return 1 if successful, 0 otherwise.
 */
static int xmlTextWriterWriteNs0TripleElement(xmlTextWriterPtr writer, struct Clue_Solver_Rest_ns0_triple *_triple) {
  return xmlTextWriterWriteNs0TripleElementNS(writer, _triple, 0);
}

/**
 * Writes a Triple to XML under element name "triple".
 *
 * @param writer The XML writer.
 * @param _triple The Triple to write.
 * @param writeNamespaces Whether to write the namespace prefixes.
 * @return 1 if successful, 0 otherwise.
 */
static int xmlTextWriterWriteNs0TripleElementNS(xmlTextWriterPtr writer, struct Clue_Solver_Rest_ns0_triple *_triple, int writeNamespaces) {
  int totalBytes = 0;
  int status;

  status = xmlTextWriterStartElementNS(writer, NULL, BAD_CAST "triple", NULL);
  if (status < 0) {
#if DEBUG_ENUNCIATE
    printf("unable to write start element {}triple. status: %i\n", status);
#endif
    return status;
  }
  totalBytes += status;

#if DEBUG_ENUNCIATE > 1
  printf("writing type {}triple for root element {}triple...\n");
#endif
  status = xmlTextWriterWriteNs0TripleType(writer, _triple);
  if (status < 0) {
#if DEBUG_ENUNCIATE
    printf("unable to write type for start element {}triple. status: %i\n", status);
#endif
    return status;
  }
  totalBytes += status;

  status = xmlTextWriterEndElement(writer);
  if (status < 0) {
#if DEBUG_ENUNCIATE
    printf("unable to end element {}triple. status: %i\n", status);
#endif
    return status;
  }
  totalBytes += status;

  return totalBytes;
}

/**
 * Frees the children of a Triple.
 *
 * @param _triple The Triple whose children are to be free.
 */
static void freeNs0TripleElement(struct Clue_Solver_Rest_ns0_triple *_triple) {
  freeNs0TripleType(_triple);
}

/**
 * Reads a Triple from XML. The reader is assumed to be at the start element.
 *
 * @return the Triple, or NULL in case of error.
 */
static struct Clue_Solver_Rest_ns0_triple *xmlTextReaderReadNs0TripleType(xmlTextReaderPtr reader) {
  int status, depth;
  void *_child_accessor;
  struct Clue_Solver_Rest_ns0_triple *_triple = calloc(1, sizeof(struct Clue_Solver_Rest_ns0_triple));



  if (xmlTextReaderIsEmptyElement(reader) == 0) {
    depth = xmlTextReaderDepth(reader);//track the depth.
    status = xmlTextReaderAdvanceToNextStartOrEndElement(reader);

    while (xmlTextReaderDepth(reader) > depth) {
      if (status < 1) {
        //panic: XML read error.
#if DEBUG_ENUNCIATE
        printf("Failure to advance to next child element.\n");
#endif
        freeNs0TripleType(_triple);
        free(_triple);
        return NULL;
      }
      else if (xmlTextReaderNodeType(reader) == XML_READER_TYPE_ELEMENT
        && xmlStrcmp(BAD_CAST "suspect", xmlTextReaderConstLocalName(reader)) == 0
        && xmlTextReaderConstNamespaceUri(reader) == NULL) {

#if DEBUG_ENUNCIATE > 1
        printf("Attempting to read choice {}suspect of type {}suspect.\n");
#endif
        _child_accessor = xmlTextReaderReadNs0SuspectType(reader);
        if (_child_accessor == NULL) {
#if DEBUG_ENUNCIATE
          printf("Failed to read choice {}suspect of type {}suspect.\n");
#endif
          //panic: unable to read the child element for some reason.
          freeNs0TripleType(_triple);
          free(_triple);
          return NULL;
        }

        _triple->suspect = ((struct Clue_Solver_Rest_ns0_suspect*)_child_accessor);
        status = xmlTextReaderAdvanceToNextStartOrEndElement(reader);
      }
      else if (xmlTextReaderNodeType(reader) == XML_READER_TYPE_ELEMENT
        && xmlStrcmp(BAD_CAST "room", xmlTextReaderConstLocalName(reader)) == 0
        && xmlTextReaderConstNamespaceUri(reader) == NULL) {

#if DEBUG_ENUNCIATE > 1
        printf("Attempting to read choice {}room of type {}room.\n");
#endif
        _child_accessor = xmlTextReaderReadNs0RoomType(reader);
        if (_child_accessor == NULL) {
#if DEBUG_ENUNCIATE
          printf("Failed to read choice {}room of type {}room.\n");
#endif
          //panic: unable to read the child element for some reason.
          freeNs0TripleType(_triple);
          free(_triple);
          return NULL;
        }

        _triple->room = ((struct Clue_Solver_Rest_ns0_room*)_child_accessor);
        status = xmlTextReaderAdvanceToNextStartOrEndElement(reader);
      }
      else if (xmlTextReaderNodeType(reader) == XML_READER_TYPE_ELEMENT
        && xmlStrcmp(BAD_CAST "weapon", xmlTextReaderConstLocalName(reader)) == 0
        && xmlTextReaderConstNamespaceUri(reader) == NULL) {

#if DEBUG_ENUNCIATE > 1
        printf("Attempting to read choice {}weapon of type {}weapon.\n");
#endif
        _child_accessor = xmlTextReaderReadNs0WeaponType(reader);
        if (_child_accessor == NULL) {
#if DEBUG_ENUNCIATE
          printf("Failed to read choice {}weapon of type {}weapon.\n");
#endif
          //panic: unable to read the child element for some reason.
          freeNs0TripleType(_triple);
          free(_triple);
          return NULL;
        }

        _triple->weapon = ((struct Clue_Solver_Rest_ns0_weapon*)_child_accessor);
        status = xmlTextReaderAdvanceToNextStartOrEndElement(reader);
      }
      else {
#if DEBUG_ENUNCIATE > 1
        if (xmlTextReaderConstNamespaceUri(reader) == NULL) {
          printf("unknown child element {}%s for type {}triple.  Skipping...\n",  xmlTextReaderConstLocalName(reader));
        }
        else {
          printf("unknown child element {%s}%s for type {}triple. Skipping...\n", xmlTextReaderConstNamespaceUri(reader), xmlTextReaderConstLocalName(reader));
        }
#endif
        status = xmlTextReaderSkipElement(reader);
      }
    }
  }

  return _triple;
}

/**
 * Writes a Triple to XML.
 *
 * @param writer The XML writer.
 * @param _triple The Triple to write.
 * @return The total bytes written, or -1 on error;
 */
static int xmlTextWriterWriteNs0TripleType(xmlTextWriterPtr writer, struct Clue_Solver_Rest_ns0_triple *_triple) {
  int status, totalBytes = 0, i;
  xmlChar *binaryData;
  if (_triple->suspect != NULL) {
    status = xmlTextWriterStartElementNS(writer, NULL, BAD_CAST "suspect", NULL);
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write start element {}suspect. status: %i\n", status);
#endif
      return status;
    }
    totalBytes += status;
#if DEBUG_ENUNCIATE > 1
    printf("writing type {}suspect for element {}suspect...\n");
#endif
    status = xmlTextWriterWriteNs0SuspectType(writer, (_triple->suspect));
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write type {}suspect for element {}suspect. status: %i\n", status);
#endif
      return status;
    }
    totalBytes += status;

    status = xmlTextWriterEndElement(writer);
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write end element {}suspect. status: %i\n", status);
#endif
      return status;
    }
    totalBytes += status;
  }
  if (_triple->room != NULL) {
    status = xmlTextWriterStartElementNS(writer, NULL, BAD_CAST "room", NULL);
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write start element {}room. status: %i\n", status);
#endif
      return status;
    }
    totalBytes += status;
#if DEBUG_ENUNCIATE > 1
    printf("writing type {}room for element {}room...\n");
#endif
    status = xmlTextWriterWriteNs0RoomType(writer, (_triple->room));
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write type {}room for element {}room. status: %i\n", status);
#endif
      return status;
    }
    totalBytes += status;

    status = xmlTextWriterEndElement(writer);
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write end element {}room. status: %i\n", status);
#endif
      return status;
    }
    totalBytes += status;
  }
  if (_triple->weapon != NULL) {
    status = xmlTextWriterStartElementNS(writer, NULL, BAD_CAST "weapon", NULL);
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write start element {}weapon. status: %i\n", status);
#endif
      return status;
    }
    totalBytes += status;
#if DEBUG_ENUNCIATE > 1
    printf("writing type {}weapon for element {}weapon...\n");
#endif
    status = xmlTextWriterWriteNs0WeaponType(writer, (_triple->weapon));
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write type {}weapon for element {}weapon. status: %i\n", status);
#endif
      return status;
    }
    totalBytes += status;

    status = xmlTextWriterEndElement(writer);
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write end element {}weapon. status: %i\n", status);
#endif
      return status;
    }
    totalBytes += status;
  }

  return totalBytes;
}

/**
 * Frees the elements of a Triple.
 *
 * @param _triple The Triple to free.
 */
static void freeNs0TripleType(struct Clue_Solver_Rest_ns0_triple *_triple) {
  int i;
  if (_triple->suspect != NULL) {
#if DEBUG_ENUNCIATE > 1
    printf("Freeing type of accessor suspect of type Clue_Solver_Rest_ns0_triple...\n");
#endif
    freeNs0SuspectType(_triple->suspect);
#if DEBUG_ENUNCIATE > 1
    printf("Freeing accessor suspect of type Clue_Solver_Rest_ns0_triple...\n");
#endif
    free(_triple->suspect);
  }
  if (_triple->room != NULL) {
#if DEBUG_ENUNCIATE > 1
    printf("Freeing type of accessor room of type Clue_Solver_Rest_ns0_triple...\n");
#endif
    freeNs0RoomType(_triple->room);
#if DEBUG_ENUNCIATE > 1
    printf("Freeing accessor room of type Clue_Solver_Rest_ns0_triple...\n");
#endif
    free(_triple->room);
  }
  if (_triple->weapon != NULL) {
#if DEBUG_ENUNCIATE > 1
    printf("Freeing type of accessor weapon of type Clue_Solver_Rest_ns0_triple...\n");
#endif
    freeNs0WeaponType(_triple->weapon);
#if DEBUG_ENUNCIATE > 1
    printf("Freeing accessor weapon of type Clue_Solver_Rest_ns0_triple...\n");
#endif
    free(_triple->weapon);
  }
}
#endif /* DEF_Clue_Solver_Rest_ns0_triple_M */
#ifndef DEF_Clue_Solver_Rest_ns0_weapon_M
#define DEF_Clue_Solver_Rest_ns0_weapon_M

/**
 * Reads a Weapon element from XML. The element to be read is "weapon", and
 * it is assumed that the reader is pointing to the XML document (not the element).
 *
 * @param reader The XML reader.
 * @return The Weapon, or NULL in case of error.
 */
struct Clue_Solver_Rest_ns0_weapon *xml_read_Clue_Solver_Rest_ns0_weapon(xmlTextReaderPtr reader) {
  int status = xmlTextReaderAdvanceToNextStartOrEndElement(reader);
  return xmlTextReaderReadNs0WeaponElement(reader);
}

/**
 * Writes a Weapon to XML under element name "weapon".
 *
 * @param writer The XML writer.
 * @param _weapon The Weapon to write.
 * @return 1 if successful, 0 otherwise.
 */
int xml_write_Clue_Solver_Rest_ns0_weapon(xmlTextWriterPtr writer, struct Clue_Solver_Rest_ns0_weapon *_weapon) {
  return xmlTextWriterWriteNs0WeaponElementNS(writer, _weapon, 1);
}

/**
 * Frees a Weapon.
 *
 * @param _weapon The Weapon to free.
 */
void free_Clue_Solver_Rest_ns0_weapon(struct Clue_Solver_Rest_ns0_weapon *_weapon) {
  freeNs0WeaponType(_weapon);
  free(_weapon);
}

/**
 * Reads a Weapon element from XML. The element to be read is "weapon", and
 * it is assumed that the reader is pointing to that element.
 *
 * @param reader The XML reader.
 * @return The Weapon, or NULL in case of error.
 */
struct Clue_Solver_Rest_ns0_weapon *xmlTextReaderReadNs0WeaponElement(xmlTextReaderPtr reader) {
  struct Clue_Solver_Rest_ns0_weapon *_weapon = NULL;

  if (xmlTextReaderNodeType(reader) == XML_READER_TYPE_ELEMENT
    && xmlStrcmp(BAD_CAST "weapon", xmlTextReaderConstLocalName(reader)) == 0
    && xmlTextReaderConstNamespaceUri(reader) == NULL) {
#if DEBUG_ENUNCIATE > 1
    printf("Attempting to read root element {}weapon.\n");
#endif
    _weapon = xmlTextReaderReadNs0WeaponType(reader);
  }
#if DEBUG_ENUNCIATE
  if (_weapon == NULL) {
    if (xmlTextReaderConstNamespaceUri(reader) == NULL) {
      printf("attempt to read {}weapon failed. current element: {}%s\n",  xmlTextReaderConstLocalName(reader));
    }
    else {
      printf("attempt to read {}weapon failed. current element: {%s}%s\n", xmlTextReaderConstNamespaceUri(reader), xmlTextReaderConstLocalName(reader));
    }
  }
#endif

  return _weapon;
}

/**
 * Writes a Weapon to XML under element name "weapon".
 * Does NOT write the namespace prefixes.
 *
 * @param writer The XML writer.
 * @param _weapon The Weapon to write.
 * @return 1 if successful, 0 otherwise.
 */
static int xmlTextWriterWriteNs0WeaponElement(xmlTextWriterPtr writer, struct Clue_Solver_Rest_ns0_weapon *_weapon) {
  return xmlTextWriterWriteNs0WeaponElementNS(writer, _weapon, 0);
}

/**
 * Writes a Weapon to XML under element name "weapon".
 *
 * @param writer The XML writer.
 * @param _weapon The Weapon to write.
 * @param writeNamespaces Whether to write the namespace prefixes.
 * @return 1 if successful, 0 otherwise.
 */
static int xmlTextWriterWriteNs0WeaponElementNS(xmlTextWriterPtr writer, struct Clue_Solver_Rest_ns0_weapon *_weapon, int writeNamespaces) {
  int totalBytes = 0;
  int status;

  status = xmlTextWriterStartElementNS(writer, NULL, BAD_CAST "weapon", NULL);
  if (status < 0) {
#if DEBUG_ENUNCIATE
    printf("unable to write start element {}weapon. status: %i\n", status);
#endif
    return status;
  }
  totalBytes += status;

#if DEBUG_ENUNCIATE > 1
  printf("writing type {}weapon for root element {}weapon...\n");
#endif
  status = xmlTextWriterWriteNs0WeaponType(writer, _weapon);
  if (status < 0) {
#if DEBUG_ENUNCIATE
    printf("unable to write type for start element {}weapon. status: %i\n", status);
#endif
    return status;
  }
  totalBytes += status;

  status = xmlTextWriterEndElement(writer);
  if (status < 0) {
#if DEBUG_ENUNCIATE
    printf("unable to end element {}weapon. status: %i\n", status);
#endif
    return status;
  }
  totalBytes += status;

  return totalBytes;
}

/**
 * Frees the children of a Weapon.
 *
 * @param _weapon The Weapon whose children are to be free.
 */
static void freeNs0WeaponElement(struct Clue_Solver_Rest_ns0_weapon *_weapon) {
  freeNs0WeaponType(_weapon);
}

/**
 * Reads a Weapon from XML. The reader is assumed to be at the start element.
 *
 * @return the Weapon, or NULL in case of error.
 */
static struct Clue_Solver_Rest_ns0_weapon *xmlTextReaderReadNs0WeaponType(xmlTextReaderPtr reader) {
  int status, depth;
  void *_child_accessor;
  struct Clue_Solver_Rest_ns0_weapon *_weapon = calloc(1, sizeof(struct Clue_Solver_Rest_ns0_weapon));

  if (xmlTextReaderHasAttributes(reader)) {
    while (xmlTextReaderMoveToNextAttribute(reader)) {
      if ((xmlStrcmp(BAD_CAST "name", xmlTextReaderConstLocalName(reader)) == 0) && (xmlTextReaderConstNamespaceUri(reader) == NULL)) {
#if DEBUG_ENUNCIATE > 1
        printf("Attempting to read type {http://www.w3.org/2001/XMLSchema}string from attribute {}name...\n");
#endif
        _child_accessor = xmlTextReaderReadXsStringType(reader);
        if (_child_accessor == NULL) {
          //panic: unable to return the attribute value for some reason.
#if DEBUG_ENUNCIATE
          printf("Failed to read attribute {}name of type {http://www.w3.org/2001/XMLSchema}string.\n");
#endif
          freeNs0WeaponType(_weapon);
          free(_weapon);
          return NULL;
        }
        _weapon->name = ((xmlChar*)_child_accessor);
        continue;
      }
      if ((xmlStrcmp(BAD_CAST "type", xmlTextReaderConstLocalName(reader)) == 0) && (xmlTextReaderConstNamespaceUri(reader) == NULL)) {
#if DEBUG_ENUNCIATE > 1
        printf("Attempting to read type {http://www.w3.org/2001/XMLSchema}string from attribute {}type...\n");
#endif
        _child_accessor = xmlTextReaderReadXsStringType(reader);
        if (_child_accessor == NULL) {
          //panic: unable to return the attribute value for some reason.
#if DEBUG_ENUNCIATE
          printf("Failed to read attribute {}type of type {http://www.w3.org/2001/XMLSchema}string.\n");
#endif
          freeNs0WeaponType(_weapon);
          free(_weapon);
          return NULL;
        }
        _weapon->type = ((xmlChar*)_child_accessor);
        continue;
      }
    }

    status = xmlTextReaderMoveToElement(reader);
    if (status < 1) {
      //panic: unable to return to the element node.
#if DEBUG_ENUNCIATE
      printf("Unable to return to element node from attributes.\n");
#endif
      freeNs0WeaponType(_weapon);
      free(_weapon);
      return NULL;
    }
  }



  return _weapon;
}

/**
 * Writes a Weapon to XML.
 *
 * @param writer The XML writer.
 * @param _weapon The Weapon to write.
 * @return The total bytes written, or -1 on error;
 */
static int xmlTextWriterWriteNs0WeaponType(xmlTextWriterPtr writer, struct Clue_Solver_Rest_ns0_weapon *_weapon) {
  int status, totalBytes = 0, i;
  xmlChar *binaryData;

  if (_weapon->name != NULL) {
    status = xmlTextWriterStartAttributeNS(writer, NULL, BAD_CAST "name", NULL);
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write start attribute {}name. status: %i\n", status);
#endif
      return status;
    }
    totalBytes += status;

#if DEBUG_ENUNCIATE > 1
    printf("writing type {http://www.w3.org/2001/XMLSchema}string for attribute {}name...\n");
#endif
    status = xmlTextWriterWriteXsStringType(writer, (_weapon->name));
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write type {http://www.w3.org/2001/XMLSchema}string for attribute {}name. status: %i", status);
#endif
      return status;
    }
    totalBytes += status;

    status = xmlTextWriterEndAttribute(writer);
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write end attribute {}name. status: %i", status);
#endif
      return status;
    }
    totalBytes += status;
  }

  if (_weapon->type != NULL) {
    status = xmlTextWriterStartAttributeNS(writer, NULL, BAD_CAST "type", NULL);
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write start attribute {}type. status: %i\n", status);
#endif
      return status;
    }
    totalBytes += status;

#if DEBUG_ENUNCIATE > 1
    printf("writing type {http://www.w3.org/2001/XMLSchema}string for attribute {}type...\n");
#endif
    status = xmlTextWriterWriteXsStringType(writer, (_weapon->type));
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write type {http://www.w3.org/2001/XMLSchema}string for attribute {}type. status: %i", status);
#endif
      return status;
    }
    totalBytes += status;

    status = xmlTextWriterEndAttribute(writer);
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write end attribute {}type. status: %i", status);
#endif
      return status;
    }
    totalBytes += status;
  }

  return totalBytes;
}

/**
 * Frees the elements of a Weapon.
 *
 * @param _weapon The Weapon to free.
 */
static void freeNs0WeaponType(struct Clue_Solver_Rest_ns0_weapon *_weapon) {
  int i;
  if (_weapon->name != NULL) {
#if DEBUG_ENUNCIATE > 1
    printf("Freeing type of accessor name of type Clue_Solver_Rest_ns0_weapon...\n");
#endif
    freeXsStringType(_weapon->name);
#if DEBUG_ENUNCIATE > 1
    printf("Freeing accessor name of type Clue_Solver_Rest_ns0_weapon...\n");
#endif
    free(_weapon->name);
  }
  if (_weapon->type != NULL) {
#if DEBUG_ENUNCIATE > 1
    printf("Freeing type of accessor type of type Clue_Solver_Rest_ns0_weapon...\n");
#endif
    freeXsStringType(_weapon->type);
#if DEBUG_ENUNCIATE > 1
    printf("Freeing accessor type of type Clue_Solver_Rest_ns0_weapon...\n");
#endif
    free(_weapon->type);
  }
}
#endif /* DEF_Clue_Solver_Rest_ns0_weapon_M */
#ifndef DEF_Clue_Solver_Rest_ns0_clueServerStatus_M
#define DEF_Clue_Solver_Rest_ns0_clueServerStatus_M

/**
 * Reads a ClueServerStatus element from XML. The element to be read is "status", and
 * it is assumed that the reader is pointing to the XML document (not the element).
 *
 * @param reader The XML reader.
 * @return The ClueServerStatus, or NULL in case of error.
 */
struct Clue_Solver_Rest_ns0_clueServerStatus *xml_read_Clue_Solver_Rest_ns0_clueServerStatus(xmlTextReaderPtr reader) {
  int status = xmlTextReaderAdvanceToNextStartOrEndElement(reader);
  return xmlTextReaderReadNs0StatusElement(reader);
}

/**
 * Writes a ClueServerStatus to XML under element name "status".
 *
 * @param writer The XML writer.
 * @param _clueServerStatus The ClueServerStatus to write.
 * @return 1 if successful, 0 otherwise.
 */
int xml_write_Clue_Solver_Rest_ns0_clueServerStatus(xmlTextWriterPtr writer, struct Clue_Solver_Rest_ns0_clueServerStatus *_clueServerStatus) {
  return xmlTextWriterWriteNs0StatusElementNS(writer, _clueServerStatus, 1);
}

/**
 * Frees a ClueServerStatus.
 *
 * @param _clueServerStatus The ClueServerStatus to free.
 */
void free_Clue_Solver_Rest_ns0_clueServerStatus(struct Clue_Solver_Rest_ns0_clueServerStatus *_clueServerStatus) {
  freeNs0ClueServerStatusType(_clueServerStatus);
  free(_clueServerStatus);
}

/**
 * Reads a ClueServerStatus element from XML. The element to be read is "status", and
 * it is assumed that the reader is pointing to that element.
 *
 * @param reader The XML reader.
 * @return The ClueServerStatus, or NULL in case of error.
 */
struct Clue_Solver_Rest_ns0_clueServerStatus *xmlTextReaderReadNs0StatusElement(xmlTextReaderPtr reader) {
  struct Clue_Solver_Rest_ns0_clueServerStatus *_clueServerStatus = NULL;

  if (xmlTextReaderNodeType(reader) == XML_READER_TYPE_ELEMENT
    && xmlStrcmp(BAD_CAST "status", xmlTextReaderConstLocalName(reader)) == 0
    && xmlTextReaderConstNamespaceUri(reader) == NULL) {
#if DEBUG_ENUNCIATE > 1
    printf("Attempting to read root element {}status.\n");
#endif
    _clueServerStatus = xmlTextReaderReadNs0ClueServerStatusType(reader);
  }
#if DEBUG_ENUNCIATE
  if (_clueServerStatus == NULL) {
    if (xmlTextReaderConstNamespaceUri(reader) == NULL) {
      printf("attempt to read {}status failed. current element: {}%s\n",  xmlTextReaderConstLocalName(reader));
    }
    else {
      printf("attempt to read {}status failed. current element: {%s}%s\n", xmlTextReaderConstNamespaceUri(reader), xmlTextReaderConstLocalName(reader));
    }
  }
#endif

  return _clueServerStatus;
}

/**
 * Writes a ClueServerStatus to XML under element name "status".
 * Does NOT write the namespace prefixes.
 *
 * @param writer The XML writer.
 * @param _clueServerStatus The ClueServerStatus to write.
 * @return 1 if successful, 0 otherwise.
 */
static int xmlTextWriterWriteNs0StatusElement(xmlTextWriterPtr writer, struct Clue_Solver_Rest_ns0_clueServerStatus *_clueServerStatus) {
  return xmlTextWriterWriteNs0StatusElementNS(writer, _clueServerStatus, 0);
}

/**
 * Writes a ClueServerStatus to XML under element name "status".
 *
 * @param writer The XML writer.
 * @param _clueServerStatus The ClueServerStatus to write.
 * @param writeNamespaces Whether to write the namespace prefixes.
 * @return 1 if successful, 0 otherwise.
 */
static int xmlTextWriterWriteNs0StatusElementNS(xmlTextWriterPtr writer, struct Clue_Solver_Rest_ns0_clueServerStatus *_clueServerStatus, int writeNamespaces) {
  int totalBytes = 0;
  int status;

  status = xmlTextWriterStartElementNS(writer, NULL, BAD_CAST "status", NULL);
  if (status < 0) {
#if DEBUG_ENUNCIATE
    printf("unable to write start element {}status. status: %i\n", status);
#endif
    return status;
  }
  totalBytes += status;

#if DEBUG_ENUNCIATE > 1
  printf("writing type {}clueServerStatus for root element {}status...\n");
#endif
  status = xmlTextWriterWriteNs0ClueServerStatusType(writer, _clueServerStatus);
  if (status < 0) {
#if DEBUG_ENUNCIATE
    printf("unable to write type for start element {}status. status: %i\n", status);
#endif
    return status;
  }
  totalBytes += status;

  status = xmlTextWriterEndElement(writer);
  if (status < 0) {
#if DEBUG_ENUNCIATE
    printf("unable to end element {}status. status: %i\n", status);
#endif
    return status;
  }
  totalBytes += status;

  return totalBytes;
}

/**
 * Frees the children of a ClueServerStatus.
 *
 * @param _clueServerStatus The ClueServerStatus whose children are to be free.
 */
static void freeNs0StatusElement(struct Clue_Solver_Rest_ns0_clueServerStatus *_clueServerStatus) {
  freeNs0ClueServerStatusType(_clueServerStatus);
}

/**
 * Reads a ClueServerStatus from XML. The reader is assumed to be at the start element.
 *
 * @return the ClueServerStatus, or NULL in case of error.
 */
static struct Clue_Solver_Rest_ns0_clueServerStatus *xmlTextReaderReadNs0ClueServerStatusType(xmlTextReaderPtr reader) {
  int status, depth;
  void *_child_accessor;
  struct Clue_Solver_Rest_ns0_clueServerStatus *_clueServerStatus = calloc(1, sizeof(struct Clue_Solver_Rest_ns0_clueServerStatus));



  if (xmlTextReaderIsEmptyElement(reader) == 0) {
    depth = xmlTextReaderDepth(reader);//track the depth.
    status = xmlTextReaderAdvanceToNextStartOrEndElement(reader);

    while (xmlTextReaderDepth(reader) > depth) {
      if (status < 1) {
        //panic: XML read error.
#if DEBUG_ENUNCIATE
        printf("Failure to advance to next child element.\n");
#endif
        freeNs0ClueServerStatusType(_clueServerStatus);
        free(_clueServerStatus);
        return NULL;
      }
      else if (xmlTextReaderNodeType(reader) == XML_READER_TYPE_ELEMENT
        && xmlStrcmp(BAD_CAST "remainingTriples", xmlTextReaderConstLocalName(reader)) == 0
        && xmlTextReaderConstNamespaceUri(reader) == NULL) {

        if (xmlTextReaderIsEmptyElement(reader) == 0) {
#if DEBUG_ENUNCIATE > 1
          printf("Unwrapping wrapper element {}remainingTriples...\n");
#endif
          //start wrapper element "{}remainingTriples"
          status = xmlTextReaderAdvanceToNextStartOrEndElement(reader);
          while (xmlTextReaderDepth(reader) > (depth + 1)) {
            if (status < 1) {
              //panic: XML read error.
#if DEBUG_ENUNCIATE
              printf("Failure to advance to next child element.\n");
#endif
              freeNs0ClueServerStatusType(_clueServerStatus);
              free(_clueServerStatus);
              return NULL;
            }
      else if (xmlTextReaderNodeType(reader) == XML_READER_TYPE_ELEMENT
        && xmlStrcmp(BAD_CAST "triple", xmlTextReaderConstLocalName(reader)) == 0
        && xmlTextReaderConstNamespaceUri(reader) == NULL) {

#if DEBUG_ENUNCIATE > 1
        printf("Attempting to read choice {}triple of type {}triple.\n");
#endif
        _child_accessor = xmlTextReaderReadNs0TripleType(reader);
        if (_child_accessor == NULL) {
#if DEBUG_ENUNCIATE
          printf("Failed to read choice {}triple of type {}triple.\n");
#endif
          //panic: unable to read the child element for some reason.
          freeNs0ClueServerStatusType(_clueServerStatus);
          free(_clueServerStatus);
          return NULL;
        }

        _clueServerStatus->remainingTriples = realloc(_clueServerStatus->remainingTriples, (_clueServerStatus->_sizeof_remainingTriples + 1) * sizeof(struct Clue_Solver_Rest_ns0_triple));
        memcpy(&(_clueServerStatus->remainingTriples[_clueServerStatus->_sizeof_remainingTriples++]), _child_accessor, sizeof(struct Clue_Solver_Rest_ns0_triple));
        free(_child_accessor);
        status = xmlTextReaderAdvanceToNextStartOrEndElement(reader);
      }
          } // end "while in wrapper element" loop
        } //end "if empty element" clause

        if (status < 1) {
          //panic: XML read error.
#if DEBUG_ENUNCIATE
          printf("Failed to advance to end wrapper element {}remainingTriples.\n");
#endif
          freeNs0ClueServerStatusType(_clueServerStatus);
          free(_clueServerStatus);
          return NULL;
        }
        else {
          //end wrapper element "{}remainingTriples"
          status = xmlTextReaderAdvanceToNextStartOrEndElement(reader);
        }
      } // end "if wrapper element" clause
      else if (xmlTextReaderNodeType(reader) == XML_READER_TYPE_ELEMENT
        && xmlStrcmp(BAD_CAST "remainingCards", xmlTextReaderConstLocalName(reader)) == 0
        && xmlTextReaderConstNamespaceUri(reader) == NULL) {

        if (xmlTextReaderIsEmptyElement(reader) == 0) {
#if DEBUG_ENUNCIATE > 1
          printf("Unwrapping wrapper element {}remainingCards...\n");
#endif
          //start wrapper element "{}remainingCards"
          status = xmlTextReaderAdvanceToNextStartOrEndElement(reader);
          while (xmlTextReaderDepth(reader) > (depth + 1)) {
            if (status < 1) {
              //panic: XML read error.
#if DEBUG_ENUNCIATE
              printf("Failure to advance to next child element.\n");
#endif
              freeNs0ClueServerStatusType(_clueServerStatus);
              free(_clueServerStatus);
              return NULL;
            }
      else if (xmlTextReaderNodeType(reader) == XML_READER_TYPE_ELEMENT
        && xmlStrcmp(BAD_CAST "card", xmlTextReaderConstLocalName(reader)) == 0
        && xmlTextReaderConstNamespaceUri(reader) == NULL) {

#if DEBUG_ENUNCIATE > 1
        printf("Attempting to read choice {}card of type {}card.\n");
#endif
        _child_accessor = xmlTextReaderReadNs0CardType(reader);
        if (_child_accessor == NULL) {
#if DEBUG_ENUNCIATE
          printf("Failed to read choice {}card of type {}card.\n");
#endif
          //panic: unable to read the child element for some reason.
          freeNs0ClueServerStatusType(_clueServerStatus);
          free(_clueServerStatus);
          return NULL;
        }

        _clueServerStatus->remainingCards = realloc(_clueServerStatus->remainingCards, (_clueServerStatus->_sizeof_remainingCards + 1) * sizeof(struct Clue_Solver_Rest_ns0_card));
        memcpy(&(_clueServerStatus->remainingCards[_clueServerStatus->_sizeof_remainingCards++]), _child_accessor, sizeof(struct Clue_Solver_Rest_ns0_card));
        free(_child_accessor);
        status = xmlTextReaderAdvanceToNextStartOrEndElement(reader);
      }
          } // end "while in wrapper element" loop
        } //end "if empty element" clause

        if (status < 1) {
          //panic: XML read error.
#if DEBUG_ENUNCIATE
          printf("Failed to advance to end wrapper element {}remainingCards.\n");
#endif
          freeNs0ClueServerStatusType(_clueServerStatus);
          free(_clueServerStatus);
          return NULL;
        }
        else {
          //end wrapper element "{}remainingCards"
          status = xmlTextReaderAdvanceToNextStartOrEndElement(reader);
        }
      } // end "if wrapper element" clause
      else {
#if DEBUG_ENUNCIATE > 1
        if (xmlTextReaderConstNamespaceUri(reader) == NULL) {
          printf("unknown child element {}%s for type {}clueServerStatus.  Skipping...\n",  xmlTextReaderConstLocalName(reader));
        }
        else {
          printf("unknown child element {%s}%s for type {}clueServerStatus. Skipping...\n", xmlTextReaderConstNamespaceUri(reader), xmlTextReaderConstLocalName(reader));
        }
#endif
        status = xmlTextReaderSkipElement(reader);
      }
    }
  }

  return _clueServerStatus;
}

/**
 * Writes a ClueServerStatus to XML.
 *
 * @param writer The XML writer.
 * @param _clueServerStatus The ClueServerStatus to write.
 * @return The total bytes written, or -1 on error;
 */
static int xmlTextWriterWriteNs0ClueServerStatusType(xmlTextWriterPtr writer, struct Clue_Solver_Rest_ns0_clueServerStatus *_clueServerStatus) {
  int status, totalBytes = 0, i;
  xmlChar *binaryData;

  if (_clueServerStatus->remainingTriples != NULL) {
    status = xmlTextWriterStartElementNS(writer, NULL, BAD_CAST "remainingTriples", NULL);
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write start element {}remainingTriples. status: %i\n", status);
#endif
      return status;
    }
    totalBytes += status;
  }
  for (i = 0; i < _clueServerStatus->_sizeof_remainingTriples; i++) {
    status = xmlTextWriterStartElementNS(writer, NULL, BAD_CAST "triple", NULL);
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write start element {}triple. status: %i\n", status);
#endif
      return status;
    }
    totalBytes += status;
#if DEBUG_ENUNCIATE > 1
    printf("writing type {}triple for element {}triple...\n");
#endif
    status = xmlTextWriterWriteNs0TripleType(writer, &(_clueServerStatus->remainingTriples[i]));
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write type {}triple for element {}triple. status: %i\n", status);
#endif
      return status;
    }
    totalBytes += status;

    status = xmlTextWriterEndElement(writer);
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write end element {}triple. status: %i\n", status);
#endif
      return status;
    }
    totalBytes += status;
  }

  if (_clueServerStatus->remainingTriples != NULL) {
    status = xmlTextWriterEndElement(writer);
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write end element {}remainingTriples. status: %i\n", status);
#endif
      return status;
    }
    totalBytes += status;
  }

  if (_clueServerStatus->remainingCards != NULL) {
    status = xmlTextWriterStartElementNS(writer, NULL, BAD_CAST "remainingCards", NULL);
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write start element {}remainingCards. status: %i\n", status);
#endif
      return status;
    }
    totalBytes += status;
  }
  for (i = 0; i < _clueServerStatus->_sizeof_remainingCards; i++) {
    status = xmlTextWriterStartElementNS(writer, NULL, BAD_CAST "card", NULL);
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write start element {}card. status: %i\n", status);
#endif
      return status;
    }
    totalBytes += status;
#if DEBUG_ENUNCIATE > 1
    printf("writing type {}card for element {}card...\n");
#endif
    status = xmlTextWriterWriteNs0CardType(writer, &(_clueServerStatus->remainingCards[i]));
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write type {}card for element {}card. status: %i\n", status);
#endif
      return status;
    }
    totalBytes += status;

    status = xmlTextWriterEndElement(writer);
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write end element {}card. status: %i\n", status);
#endif
      return status;
    }
    totalBytes += status;
  }

  if (_clueServerStatus->remainingCards != NULL) {
    status = xmlTextWriterEndElement(writer);
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write end element {}remainingCards. status: %i\n", status);
#endif
      return status;
    }
    totalBytes += status;
  }

  return totalBytes;
}

/**
 * Frees the elements of a ClueServerStatus.
 *
 * @param _clueServerStatus The ClueServerStatus to free.
 */
static void freeNs0ClueServerStatusType(struct Clue_Solver_Rest_ns0_clueServerStatus *_clueServerStatus) {
  int i;
  if (_clueServerStatus->remainingTriples != NULL) {
    for (i = 0; i < _clueServerStatus->_sizeof_remainingTriples; i++) {
#if DEBUG_ENUNCIATE > 1
      printf("Freeing accessor remainingTriples[%i] of type Clue_Solver_Rest_ns0_clueServerStatus...\n", i);
#endif
      freeNs0TripleType(&(_clueServerStatus->remainingTriples[i]));
    }
#if DEBUG_ENUNCIATE > 1
    printf("Freeing accessor remainingTriples of type Clue_Solver_Rest_ns0_clueServerStatus...\n");
#endif
    free(_clueServerStatus->remainingTriples);
  }
  if (_clueServerStatus->remainingCards != NULL) {
    for (i = 0; i < _clueServerStatus->_sizeof_remainingCards; i++) {
#if DEBUG_ENUNCIATE > 1
      printf("Freeing accessor remainingCards[%i] of type Clue_Solver_Rest_ns0_clueServerStatus...\n", i);
#endif
      freeNs0CardType(&(_clueServerStatus->remainingCards[i]));
    }
#if DEBUG_ENUNCIATE > 1
    printf("Freeing accessor remainingCards of type Clue_Solver_Rest_ns0_clueServerStatus...\n");
#endif
    free(_clueServerStatus->remainingCards);
  }
}
#endif /* DEF_Clue_Solver_Rest_ns0_clueServerStatus_M */
#ifndef DEF_Clue_Solver_Rest_ns0_probabilityReport_M
#define DEF_Clue_Solver_Rest_ns0_probabilityReport_M

/**
 * Reads a ProbabilityReport element from XML. The element to be read is "probabilityReport", and
 * it is assumed that the reader is pointing to the XML document (not the element).
 *
 * @param reader The XML reader.
 * @return The ProbabilityReport, or NULL in case of error.
 */
struct Clue_Solver_Rest_ns0_probabilityReport *xml_read_Clue_Solver_Rest_ns0_probabilityReport(xmlTextReaderPtr reader) {
  int status = xmlTextReaderAdvanceToNextStartOrEndElement(reader);
  return xmlTextReaderReadNs0ProbabilityReportElement(reader);
}

/**
 * Writes a ProbabilityReport to XML under element name "probabilityReport".
 *
 * @param writer The XML writer.
 * @param _probabilityReport The ProbabilityReport to write.
 * @return 1 if successful, 0 otherwise.
 */
int xml_write_Clue_Solver_Rest_ns0_probabilityReport(xmlTextWriterPtr writer, struct Clue_Solver_Rest_ns0_probabilityReport *_probabilityReport) {
  return xmlTextWriterWriteNs0ProbabilityReportElementNS(writer, _probabilityReport, 1);
}

/**
 * Frees a ProbabilityReport.
 *
 * @param _probabilityReport The ProbabilityReport to free.
 */
void free_Clue_Solver_Rest_ns0_probabilityReport(struct Clue_Solver_Rest_ns0_probabilityReport *_probabilityReport) {
  freeNs0ProbabilityReportType(_probabilityReport);
  free(_probabilityReport);
}

/**
 * Reads a ProbabilityReport element from XML. The element to be read is "probabilityReport", and
 * it is assumed that the reader is pointing to that element.
 *
 * @param reader The XML reader.
 * @return The ProbabilityReport, or NULL in case of error.
 */
struct Clue_Solver_Rest_ns0_probabilityReport *xmlTextReaderReadNs0ProbabilityReportElement(xmlTextReaderPtr reader) {
  struct Clue_Solver_Rest_ns0_probabilityReport *_probabilityReport = NULL;

  if (xmlTextReaderNodeType(reader) == XML_READER_TYPE_ELEMENT
    && xmlStrcmp(BAD_CAST "probabilityReport", xmlTextReaderConstLocalName(reader)) == 0
    && xmlTextReaderConstNamespaceUri(reader) == NULL) {
#if DEBUG_ENUNCIATE > 1
    printf("Attempting to read root element {}probabilityReport.\n");
#endif
    _probabilityReport = xmlTextReaderReadNs0ProbabilityReportType(reader);
  }
#if DEBUG_ENUNCIATE
  if (_probabilityReport == NULL) {
    if (xmlTextReaderConstNamespaceUri(reader) == NULL) {
      printf("attempt to read {}probabilityReport failed. current element: {}%s\n",  xmlTextReaderConstLocalName(reader));
    }
    else {
      printf("attempt to read {}probabilityReport failed. current element: {%s}%s\n", xmlTextReaderConstNamespaceUri(reader), xmlTextReaderConstLocalName(reader));
    }
  }
#endif

  return _probabilityReport;
}

/**
 * Writes a ProbabilityReport to XML under element name "probabilityReport".
 * Does NOT write the namespace prefixes.
 *
 * @param writer The XML writer.
 * @param _probabilityReport The ProbabilityReport to write.
 * @return 1 if successful, 0 otherwise.
 */
static int xmlTextWriterWriteNs0ProbabilityReportElement(xmlTextWriterPtr writer, struct Clue_Solver_Rest_ns0_probabilityReport *_probabilityReport) {
  return xmlTextWriterWriteNs0ProbabilityReportElementNS(writer, _probabilityReport, 0);
}

/**
 * Writes a ProbabilityReport to XML under element name "probabilityReport".
 *
 * @param writer The XML writer.
 * @param _probabilityReport The ProbabilityReport to write.
 * @param writeNamespaces Whether to write the namespace prefixes.
 * @return 1 if successful, 0 otherwise.
 */
static int xmlTextWriterWriteNs0ProbabilityReportElementNS(xmlTextWriterPtr writer, struct Clue_Solver_Rest_ns0_probabilityReport *_probabilityReport, int writeNamespaces) {
  int totalBytes = 0;
  int status;

  status = xmlTextWriterStartElementNS(writer, NULL, BAD_CAST "probabilityReport", NULL);
  if (status < 0) {
#if DEBUG_ENUNCIATE
    printf("unable to write start element {}probabilityReport. status: %i\n", status);
#endif
    return status;
  }
  totalBytes += status;

#if DEBUG_ENUNCIATE > 1
  printf("writing type {}probabilityReport for root element {}probabilityReport...\n");
#endif
  status = xmlTextWriterWriteNs0ProbabilityReportType(writer, _probabilityReport);
  if (status < 0) {
#if DEBUG_ENUNCIATE
    printf("unable to write type for start element {}probabilityReport. status: %i\n", status);
#endif
    return status;
  }
  totalBytes += status;

  status = xmlTextWriterEndElement(writer);
  if (status < 0) {
#if DEBUG_ENUNCIATE
    printf("unable to end element {}probabilityReport. status: %i\n", status);
#endif
    return status;
  }
  totalBytes += status;

  return totalBytes;
}

/**
 * Frees the children of a ProbabilityReport.
 *
 * @param _probabilityReport The ProbabilityReport whose children are to be free.
 */
static void freeNs0ProbabilityReportElement(struct Clue_Solver_Rest_ns0_probabilityReport *_probabilityReport) {
  freeNs0ProbabilityReportType(_probabilityReport);
}

/**
 * Reads a ProbabilityReport from XML. The reader is assumed to be at the start element.
 *
 * @return the ProbabilityReport, or NULL in case of error.
 */
static struct Clue_Solver_Rest_ns0_probabilityReport *xmlTextReaderReadNs0ProbabilityReportType(xmlTextReaderPtr reader) {
  int status, depth;
  void *_child_accessor;
  struct Clue_Solver_Rest_ns0_probabilityReport *_probabilityReport = calloc(1, sizeof(struct Clue_Solver_Rest_ns0_probabilityReport));



  if (xmlTextReaderIsEmptyElement(reader) == 0) {
    depth = xmlTextReaderDepth(reader);//track the depth.
    status = xmlTextReaderAdvanceToNextStartOrEndElement(reader);

    while (xmlTextReaderDepth(reader) > depth) {
      if (status < 1) {
        //panic: XML read error.
#if DEBUG_ENUNCIATE
        printf("Failure to advance to next child element.\n");
#endif
        freeNs0ProbabilityReportType(_probabilityReport);
        free(_probabilityReport);
        return NULL;
      }
      else if (xmlTextReaderNodeType(reader) == XML_READER_TYPE_ELEMENT
        && xmlStrcmp(BAD_CAST "rooms", xmlTextReaderConstLocalName(reader)) == 0
        && xmlTextReaderConstNamespaceUri(reader) == NULL) {

        if (xmlTextReaderIsEmptyElement(reader) == 0) {
#if DEBUG_ENUNCIATE > 1
          printf("Unwrapping wrapper element {}rooms...\n");
#endif
          //start wrapper element "{}rooms"
          status = xmlTextReaderAdvanceToNextStartOrEndElement(reader);
          while (xmlTextReaderDepth(reader) > (depth + 1)) {
            if (status < 1) {
              //panic: XML read error.
#if DEBUG_ENUNCIATE
              printf("Failure to advance to next child element.\n");
#endif
              freeNs0ProbabilityReportType(_probabilityReport);
              free(_probabilityReport);
              return NULL;
            }
      else if (xmlTextReaderNodeType(reader) == XML_READER_TYPE_ELEMENT
        && xmlStrcmp(BAD_CAST "roomProbability", xmlTextReaderConstLocalName(reader)) == 0
        && xmlTextReaderConstNamespaceUri(reader) == NULL) {

#if DEBUG_ENUNCIATE > 1
        printf("Attempting to read choice {}roomProbability of type {}probability.\n");
#endif
        _child_accessor = xmlTextReaderReadNs0ProbabilityType(reader);
        if (_child_accessor == NULL) {
#if DEBUG_ENUNCIATE
          printf("Failed to read choice {}roomProbability of type {}probability.\n");
#endif
          //panic: unable to read the child element for some reason.
          freeNs0ProbabilityReportType(_probabilityReport);
          free(_probabilityReport);
          return NULL;
        }

        _probabilityReport->rooms = realloc(_probabilityReport->rooms, (_probabilityReport->_sizeof_rooms + 1) * sizeof(struct Clue_Solver_Rest_ns0_probability));
        memcpy(&(_probabilityReport->rooms[_probabilityReport->_sizeof_rooms++]), _child_accessor, sizeof(struct Clue_Solver_Rest_ns0_probability));
        free(_child_accessor);
        status = xmlTextReaderAdvanceToNextStartOrEndElement(reader);
      }
          } // end "while in wrapper element" loop
        } //end "if empty element" clause

        if (status < 1) {
          //panic: XML read error.
#if DEBUG_ENUNCIATE
          printf("Failed to advance to end wrapper element {}rooms.\n");
#endif
          freeNs0ProbabilityReportType(_probabilityReport);
          free(_probabilityReport);
          return NULL;
        }
        else {
          //end wrapper element "{}rooms"
          status = xmlTextReaderAdvanceToNextStartOrEndElement(reader);
        }
      } // end "if wrapper element" clause
      else if (xmlTextReaderNodeType(reader) == XML_READER_TYPE_ELEMENT
        && xmlStrcmp(BAD_CAST "mostLikelyWeapon", xmlTextReaderConstLocalName(reader)) == 0
        && xmlTextReaderConstNamespaceUri(reader) == NULL) {

#if DEBUG_ENUNCIATE > 1
        printf("Attempting to read choice {}mostLikelyWeapon of type {}probability.\n");
#endif
        _child_accessor = xmlTextReaderReadNs0ProbabilityType(reader);
        if (_child_accessor == NULL) {
#if DEBUG_ENUNCIATE
          printf("Failed to read choice {}mostLikelyWeapon of type {}probability.\n");
#endif
          //panic: unable to read the child element for some reason.
          freeNs0ProbabilityReportType(_probabilityReport);
          free(_probabilityReport);
          return NULL;
        }

        _probabilityReport->mostLikelyWeapon = ((struct Clue_Solver_Rest_ns0_probability*)_child_accessor);
        status = xmlTextReaderAdvanceToNextStartOrEndElement(reader);
      }
      else if (xmlTextReaderNodeType(reader) == XML_READER_TYPE_ELEMENT
        && xmlStrcmp(BAD_CAST "mostLikelyRoom", xmlTextReaderConstLocalName(reader)) == 0
        && xmlTextReaderConstNamespaceUri(reader) == NULL) {

#if DEBUG_ENUNCIATE > 1
        printf("Attempting to read choice {}mostLikelyRoom of type {}probability.\n");
#endif
        _child_accessor = xmlTextReaderReadNs0ProbabilityType(reader);
        if (_child_accessor == NULL) {
#if DEBUG_ENUNCIATE
          printf("Failed to read choice {}mostLikelyRoom of type {}probability.\n");
#endif
          //panic: unable to read the child element for some reason.
          freeNs0ProbabilityReportType(_probabilityReport);
          free(_probabilityReport);
          return NULL;
        }

        _probabilityReport->mostLikelyRoom = ((struct Clue_Solver_Rest_ns0_probability*)_child_accessor);
        status = xmlTextReaderAdvanceToNextStartOrEndElement(reader);
      }
      else if (xmlTextReaderNodeType(reader) == XML_READER_TYPE_ELEMENT
        && xmlStrcmp(BAD_CAST "weapons", xmlTextReaderConstLocalName(reader)) == 0
        && xmlTextReaderConstNamespaceUri(reader) == NULL) {

        if (xmlTextReaderIsEmptyElement(reader) == 0) {
#if DEBUG_ENUNCIATE > 1
          printf("Unwrapping wrapper element {}weapons...\n");
#endif
          //start wrapper element "{}weapons"
          status = xmlTextReaderAdvanceToNextStartOrEndElement(reader);
          while (xmlTextReaderDepth(reader) > (depth + 1)) {
            if (status < 1) {
              //panic: XML read error.
#if DEBUG_ENUNCIATE
              printf("Failure to advance to next child element.\n");
#endif
              freeNs0ProbabilityReportType(_probabilityReport);
              free(_probabilityReport);
              return NULL;
            }
      else if (xmlTextReaderNodeType(reader) == XML_READER_TYPE_ELEMENT
        && xmlStrcmp(BAD_CAST "weaponProbability", xmlTextReaderConstLocalName(reader)) == 0
        && xmlTextReaderConstNamespaceUri(reader) == NULL) {

#if DEBUG_ENUNCIATE > 1
        printf("Attempting to read choice {}weaponProbability of type {}probability.\n");
#endif
        _child_accessor = xmlTextReaderReadNs0ProbabilityType(reader);
        if (_child_accessor == NULL) {
#if DEBUG_ENUNCIATE
          printf("Failed to read choice {}weaponProbability of type {}probability.\n");
#endif
          //panic: unable to read the child element for some reason.
          freeNs0ProbabilityReportType(_probabilityReport);
          free(_probabilityReport);
          return NULL;
        }

        _probabilityReport->weapons = realloc(_probabilityReport->weapons, (_probabilityReport->_sizeof_weapons + 1) * sizeof(struct Clue_Solver_Rest_ns0_probability));
        memcpy(&(_probabilityReport->weapons[_probabilityReport->_sizeof_weapons++]), _child_accessor, sizeof(struct Clue_Solver_Rest_ns0_probability));
        free(_child_accessor);
        status = xmlTextReaderAdvanceToNextStartOrEndElement(reader);
      }
          } // end "while in wrapper element" loop
        } //end "if empty element" clause

        if (status < 1) {
          //panic: XML read error.
#if DEBUG_ENUNCIATE
          printf("Failed to advance to end wrapper element {}weapons.\n");
#endif
          freeNs0ProbabilityReportType(_probabilityReport);
          free(_probabilityReport);
          return NULL;
        }
        else {
          //end wrapper element "{}weapons"
          status = xmlTextReaderAdvanceToNextStartOrEndElement(reader);
        }
      } // end "if wrapper element" clause
      else if (xmlTextReaderNodeType(reader) == XML_READER_TYPE_ELEMENT
        && xmlStrcmp(BAD_CAST "mostLikelyTriple", xmlTextReaderConstLocalName(reader)) == 0
        && xmlTextReaderConstNamespaceUri(reader) == NULL) {

#if DEBUG_ENUNCIATE > 1
        printf("Attempting to read choice {}mostLikelyTriple of type {}probability.\n");
#endif
        _child_accessor = xmlTextReaderReadNs0ProbabilityType(reader);
        if (_child_accessor == NULL) {
#if DEBUG_ENUNCIATE
          printf("Failed to read choice {}mostLikelyTriple of type {}probability.\n");
#endif
          //panic: unable to read the child element for some reason.
          freeNs0ProbabilityReportType(_probabilityReport);
          free(_probabilityReport);
          return NULL;
        }

        _probabilityReport->mostLikelyTriple = ((struct Clue_Solver_Rest_ns0_probability*)_child_accessor);
        status = xmlTextReaderAdvanceToNextStartOrEndElement(reader);
      }
      else if (xmlTextReaderNodeType(reader) == XML_READER_TYPE_ELEMENT
        && xmlStrcmp(BAD_CAST "mostLikelySuspect", xmlTextReaderConstLocalName(reader)) == 0
        && xmlTextReaderConstNamespaceUri(reader) == NULL) {

#if DEBUG_ENUNCIATE > 1
        printf("Attempting to read choice {}mostLikelySuspect of type {}probability.\n");
#endif
        _child_accessor = xmlTextReaderReadNs0ProbabilityType(reader);
        if (_child_accessor == NULL) {
#if DEBUG_ENUNCIATE
          printf("Failed to read choice {}mostLikelySuspect of type {}probability.\n");
#endif
          //panic: unable to read the child element for some reason.
          freeNs0ProbabilityReportType(_probabilityReport);
          free(_probabilityReport);
          return NULL;
        }

        _probabilityReport->mostLikelySuspect = ((struct Clue_Solver_Rest_ns0_probability*)_child_accessor);
        status = xmlTextReaderAdvanceToNextStartOrEndElement(reader);
      }
      else if (xmlTextReaderNodeType(reader) == XML_READER_TYPE_ELEMENT
        && xmlStrcmp(BAD_CAST "suspects", xmlTextReaderConstLocalName(reader)) == 0
        && xmlTextReaderConstNamespaceUri(reader) == NULL) {

        if (xmlTextReaderIsEmptyElement(reader) == 0) {
#if DEBUG_ENUNCIATE > 1
          printf("Unwrapping wrapper element {}suspects...\n");
#endif
          //start wrapper element "{}suspects"
          status = xmlTextReaderAdvanceToNextStartOrEndElement(reader);
          while (xmlTextReaderDepth(reader) > (depth + 1)) {
            if (status < 1) {
              //panic: XML read error.
#if DEBUG_ENUNCIATE
              printf("Failure to advance to next child element.\n");
#endif
              freeNs0ProbabilityReportType(_probabilityReport);
              free(_probabilityReport);
              return NULL;
            }
      else if (xmlTextReaderNodeType(reader) == XML_READER_TYPE_ELEMENT
        && xmlStrcmp(BAD_CAST "suspectProbability", xmlTextReaderConstLocalName(reader)) == 0
        && xmlTextReaderConstNamespaceUri(reader) == NULL) {

#if DEBUG_ENUNCIATE > 1
        printf("Attempting to read choice {}suspectProbability of type {}probability.\n");
#endif
        _child_accessor = xmlTextReaderReadNs0ProbabilityType(reader);
        if (_child_accessor == NULL) {
#if DEBUG_ENUNCIATE
          printf("Failed to read choice {}suspectProbability of type {}probability.\n");
#endif
          //panic: unable to read the child element for some reason.
          freeNs0ProbabilityReportType(_probabilityReport);
          free(_probabilityReport);
          return NULL;
        }

        _probabilityReport->suspects = realloc(_probabilityReport->suspects, (_probabilityReport->_sizeof_suspects + 1) * sizeof(struct Clue_Solver_Rest_ns0_probability));
        memcpy(&(_probabilityReport->suspects[_probabilityReport->_sizeof_suspects++]), _child_accessor, sizeof(struct Clue_Solver_Rest_ns0_probability));
        free(_child_accessor);
        status = xmlTextReaderAdvanceToNextStartOrEndElement(reader);
      }
          } // end "while in wrapper element" loop
        } //end "if empty element" clause

        if (status < 1) {
          //panic: XML read error.
#if DEBUG_ENUNCIATE
          printf("Failed to advance to end wrapper element {}suspects.\n");
#endif
          freeNs0ProbabilityReportType(_probabilityReport);
          free(_probabilityReport);
          return NULL;
        }
        else {
          //end wrapper element "{}suspects"
          status = xmlTextReaderAdvanceToNextStartOrEndElement(reader);
        }
      } // end "if wrapper element" clause
      else {
#if DEBUG_ENUNCIATE > 1
        if (xmlTextReaderConstNamespaceUri(reader) == NULL) {
          printf("unknown child element {}%s for type {}probabilityReport.  Skipping...\n",  xmlTextReaderConstLocalName(reader));
        }
        else {
          printf("unknown child element {%s}%s for type {}probabilityReport. Skipping...\n", xmlTextReaderConstNamespaceUri(reader), xmlTextReaderConstLocalName(reader));
        }
#endif
        status = xmlTextReaderSkipElement(reader);
      }
    }
  }

  return _probabilityReport;
}

/**
 * Writes a ProbabilityReport to XML.
 *
 * @param writer The XML writer.
 * @param _probabilityReport The ProbabilityReport to write.
 * @return The total bytes written, or -1 on error;
 */
static int xmlTextWriterWriteNs0ProbabilityReportType(xmlTextWriterPtr writer, struct Clue_Solver_Rest_ns0_probabilityReport *_probabilityReport) {
  int status, totalBytes = 0, i;
  xmlChar *binaryData;

  if (_probabilityReport->rooms != NULL) {
    status = xmlTextWriterStartElementNS(writer, NULL, BAD_CAST "rooms", NULL);
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write start element {}rooms. status: %i\n", status);
#endif
      return status;
    }
    totalBytes += status;
  }
  for (i = 0; i < _probabilityReport->_sizeof_rooms; i++) {
    status = xmlTextWriterStartElementNS(writer, NULL, BAD_CAST "roomProbability", NULL);
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write start element {}roomProbability. status: %i\n", status);
#endif
      return status;
    }
    totalBytes += status;
#if DEBUG_ENUNCIATE > 1
    printf("writing type {}probability for element {}roomProbability...\n");
#endif
    status = xmlTextWriterWriteNs0ProbabilityType(writer, &(_probabilityReport->rooms[i]));
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write type {}probability for element {}roomProbability. status: %i\n", status);
#endif
      return status;
    }
    totalBytes += status;

    status = xmlTextWriterEndElement(writer);
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write end element {}roomProbability. status: %i\n", status);
#endif
      return status;
    }
    totalBytes += status;
  }

  if (_probabilityReport->rooms != NULL) {
    status = xmlTextWriterEndElement(writer);
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write end element {}rooms. status: %i\n", status);
#endif
      return status;
    }
    totalBytes += status;
  }
  if (_probabilityReport->mostLikelyWeapon != NULL) {
    status = xmlTextWriterStartElementNS(writer, NULL, BAD_CAST "mostLikelyWeapon", NULL);
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write start element {}mostLikelyWeapon. status: %i\n", status);
#endif
      return status;
    }
    totalBytes += status;
#if DEBUG_ENUNCIATE > 1
    printf("writing type {}probability for element {}mostLikelyWeapon...\n");
#endif
    status = xmlTextWriterWriteNs0ProbabilityType(writer, (_probabilityReport->mostLikelyWeapon));
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write type {}probability for element {}mostLikelyWeapon. status: %i\n", status);
#endif
      return status;
    }
    totalBytes += status;

    status = xmlTextWriterEndElement(writer);
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write end element {}mostLikelyWeapon. status: %i\n", status);
#endif
      return status;
    }
    totalBytes += status;
  }
  if (_probabilityReport->mostLikelyRoom != NULL) {
    status = xmlTextWriterStartElementNS(writer, NULL, BAD_CAST "mostLikelyRoom", NULL);
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write start element {}mostLikelyRoom. status: %i\n", status);
#endif
      return status;
    }
    totalBytes += status;
#if DEBUG_ENUNCIATE > 1
    printf("writing type {}probability for element {}mostLikelyRoom...\n");
#endif
    status = xmlTextWriterWriteNs0ProbabilityType(writer, (_probabilityReport->mostLikelyRoom));
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write type {}probability for element {}mostLikelyRoom. status: %i\n", status);
#endif
      return status;
    }
    totalBytes += status;

    status = xmlTextWriterEndElement(writer);
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write end element {}mostLikelyRoom. status: %i\n", status);
#endif
      return status;
    }
    totalBytes += status;
  }

  if (_probabilityReport->weapons != NULL) {
    status = xmlTextWriterStartElementNS(writer, NULL, BAD_CAST "weapons", NULL);
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write start element {}weapons. status: %i\n", status);
#endif
      return status;
    }
    totalBytes += status;
  }
  for (i = 0; i < _probabilityReport->_sizeof_weapons; i++) {
    status = xmlTextWriterStartElementNS(writer, NULL, BAD_CAST "weaponProbability", NULL);
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write start element {}weaponProbability. status: %i\n", status);
#endif
      return status;
    }
    totalBytes += status;
#if DEBUG_ENUNCIATE > 1
    printf("writing type {}probability for element {}weaponProbability...\n");
#endif
    status = xmlTextWriterWriteNs0ProbabilityType(writer, &(_probabilityReport->weapons[i]));
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write type {}probability for element {}weaponProbability. status: %i\n", status);
#endif
      return status;
    }
    totalBytes += status;

    status = xmlTextWriterEndElement(writer);
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write end element {}weaponProbability. status: %i\n", status);
#endif
      return status;
    }
    totalBytes += status;
  }

  if (_probabilityReport->weapons != NULL) {
    status = xmlTextWriterEndElement(writer);
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write end element {}weapons. status: %i\n", status);
#endif
      return status;
    }
    totalBytes += status;
  }
  if (_probabilityReport->mostLikelyTriple != NULL) {
    status = xmlTextWriterStartElementNS(writer, NULL, BAD_CAST "mostLikelyTriple", NULL);
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write start element {}mostLikelyTriple. status: %i\n", status);
#endif
      return status;
    }
    totalBytes += status;
#if DEBUG_ENUNCIATE > 1
    printf("writing type {}probability for element {}mostLikelyTriple...\n");
#endif
    status = xmlTextWriterWriteNs0ProbabilityType(writer, (_probabilityReport->mostLikelyTriple));
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write type {}probability for element {}mostLikelyTriple. status: %i\n", status);
#endif
      return status;
    }
    totalBytes += status;

    status = xmlTextWriterEndElement(writer);
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write end element {}mostLikelyTriple. status: %i\n", status);
#endif
      return status;
    }
    totalBytes += status;
  }
  if (_probabilityReport->mostLikelySuspect != NULL) {
    status = xmlTextWriterStartElementNS(writer, NULL, BAD_CAST "mostLikelySuspect", NULL);
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write start element {}mostLikelySuspect. status: %i\n", status);
#endif
      return status;
    }
    totalBytes += status;
#if DEBUG_ENUNCIATE > 1
    printf("writing type {}probability for element {}mostLikelySuspect...\n");
#endif
    status = xmlTextWriterWriteNs0ProbabilityType(writer, (_probabilityReport->mostLikelySuspect));
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write type {}probability for element {}mostLikelySuspect. status: %i\n", status);
#endif
      return status;
    }
    totalBytes += status;

    status = xmlTextWriterEndElement(writer);
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write end element {}mostLikelySuspect. status: %i\n", status);
#endif
      return status;
    }
    totalBytes += status;
  }

  if (_probabilityReport->suspects != NULL) {
    status = xmlTextWriterStartElementNS(writer, NULL, BAD_CAST "suspects", NULL);
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write start element {}suspects. status: %i\n", status);
#endif
      return status;
    }
    totalBytes += status;
  }
  for (i = 0; i < _probabilityReport->_sizeof_suspects; i++) {
    status = xmlTextWriterStartElementNS(writer, NULL, BAD_CAST "suspectProbability", NULL);
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write start element {}suspectProbability. status: %i\n", status);
#endif
      return status;
    }
    totalBytes += status;
#if DEBUG_ENUNCIATE > 1
    printf("writing type {}probability for element {}suspectProbability...\n");
#endif
    status = xmlTextWriterWriteNs0ProbabilityType(writer, &(_probabilityReport->suspects[i]));
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write type {}probability for element {}suspectProbability. status: %i\n", status);
#endif
      return status;
    }
    totalBytes += status;

    status = xmlTextWriterEndElement(writer);
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write end element {}suspectProbability. status: %i\n", status);
#endif
      return status;
    }
    totalBytes += status;
  }

  if (_probabilityReport->suspects != NULL) {
    status = xmlTextWriterEndElement(writer);
    if (status < 0) {
#if DEBUG_ENUNCIATE
      printf("Failed to write end element {}suspects. status: %i\n", status);
#endif
      return status;
    }
    totalBytes += status;
  }

  return totalBytes;
}

/**
 * Frees the elements of a ProbabilityReport.
 *
 * @param _probabilityReport The ProbabilityReport to free.
 */
static void freeNs0ProbabilityReportType(struct Clue_Solver_Rest_ns0_probabilityReport *_probabilityReport) {
  int i;
  if (_probabilityReport->rooms != NULL) {
    for (i = 0; i < _probabilityReport->_sizeof_rooms; i++) {
#if DEBUG_ENUNCIATE > 1
      printf("Freeing accessor rooms[%i] of type Clue_Solver_Rest_ns0_probabilityReport...\n", i);
#endif
      freeNs0ProbabilityType(&(_probabilityReport->rooms[i]));
    }
#if DEBUG_ENUNCIATE > 1
    printf("Freeing accessor rooms of type Clue_Solver_Rest_ns0_probabilityReport...\n");
#endif
    free(_probabilityReport->rooms);
  }
  if (_probabilityReport->mostLikelyWeapon != NULL) {
#if DEBUG_ENUNCIATE > 1
    printf("Freeing type of accessor mostLikelyWeapon of type Clue_Solver_Rest_ns0_probabilityReport...\n");
#endif
    freeNs0ProbabilityType(_probabilityReport->mostLikelyWeapon);
#if DEBUG_ENUNCIATE > 1
    printf("Freeing accessor mostLikelyWeapon of type Clue_Solver_Rest_ns0_probabilityReport...\n");
#endif
    free(_probabilityReport->mostLikelyWeapon);
  }
  if (_probabilityReport->mostLikelyRoom != NULL) {
#if DEBUG_ENUNCIATE > 1
    printf("Freeing type of accessor mostLikelyRoom of type Clue_Solver_Rest_ns0_probabilityReport...\n");
#endif
    freeNs0ProbabilityType(_probabilityReport->mostLikelyRoom);
#if DEBUG_ENUNCIATE > 1
    printf("Freeing accessor mostLikelyRoom of type Clue_Solver_Rest_ns0_probabilityReport...\n");
#endif
    free(_probabilityReport->mostLikelyRoom);
  }
  if (_probabilityReport->weapons != NULL) {
    for (i = 0; i < _probabilityReport->_sizeof_weapons; i++) {
#if DEBUG_ENUNCIATE > 1
      printf("Freeing accessor weapons[%i] of type Clue_Solver_Rest_ns0_probabilityReport...\n", i);
#endif
      freeNs0ProbabilityType(&(_probabilityReport->weapons[i]));
    }
#if DEBUG_ENUNCIATE > 1
    printf("Freeing accessor weapons of type Clue_Solver_Rest_ns0_probabilityReport...\n");
#endif
    free(_probabilityReport->weapons);
  }
  if (_probabilityReport->mostLikelyTriple != NULL) {
#if DEBUG_ENUNCIATE > 1
    printf("Freeing type of accessor mostLikelyTriple of type Clue_Solver_Rest_ns0_probabilityReport...\n");
#endif
    freeNs0ProbabilityType(_probabilityReport->mostLikelyTriple);
#if DEBUG_ENUNCIATE > 1
    printf("Freeing accessor mostLikelyTriple of type Clue_Solver_Rest_ns0_probabilityReport...\n");
#endif
    free(_probabilityReport->mostLikelyTriple);
  }
  if (_probabilityReport->mostLikelySuspect != NULL) {
#if DEBUG_ENUNCIATE > 1
    printf("Freeing type of accessor mostLikelySuspect of type Clue_Solver_Rest_ns0_probabilityReport...\n");
#endif
    freeNs0ProbabilityType(_probabilityReport->mostLikelySuspect);
#if DEBUG_ENUNCIATE > 1
    printf("Freeing accessor mostLikelySuspect of type Clue_Solver_Rest_ns0_probabilityReport...\n");
#endif
    free(_probabilityReport->mostLikelySuspect);
  }
  if (_probabilityReport->suspects != NULL) {
    for (i = 0; i < _probabilityReport->_sizeof_suspects; i++) {
#if DEBUG_ENUNCIATE > 1
      printf("Freeing accessor suspects[%i] of type Clue_Solver_Rest_ns0_probabilityReport...\n", i);
#endif
      freeNs0ProbabilityType(&(_probabilityReport->suspects[i]));
    }
#if DEBUG_ENUNCIATE > 1
    printf("Freeing accessor suspects of type Clue_Solver_Rest_ns0_probabilityReport...\n");
#endif
    free(_probabilityReport->suspects);
  }
}
#endif /* DEF_Clue_Solver_Rest_ns0_probabilityReport_M */
