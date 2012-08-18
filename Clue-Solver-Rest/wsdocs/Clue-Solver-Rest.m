#import "Clue-Solver-Rest.h"
#ifndef DEF_CLUE_SOLVER_RESTNS0Probability_M
#define DEF_CLUE_SOLVER_RESTNS0Probability_M

/**
 * (no documentation provided)
 */
@implementation CLUE_SOLVER_RESTNS0Probability

/**
 * (no documentation provided)
 */
- (double) cardProbability
{
  return _cardProbability;
}

/**
 * (no documentation provided)
 */
- (void) setCardProbability: (double) newCardProbability
{
  _cardProbability = newCardProbability;
}

/**
 * (no documentation provided)
 *
 * Contains instances of JAXBBasicXMLNode.
 */
- (NSArray *) wrappedObject
{
  return _wrappedObject;
}

/**
 * (no documentation provided)
 *
 * Contains instances of JAXBBasicXMLNode.
 */
- (void) setWrappedObject: (NSArray *) newWrappedObject
{
  [newWrappedObject retain];
  [_wrappedObject release];
  _wrappedObject = newWrappedObject;
}

- (void) dealloc
{
  [self setWrappedObject: nil];
  [super dealloc];
}

//documentation inherited.
+ (id<EnunciateXML>) readFromXML: (NSData *) xml
{
  CLUE_SOLVER_RESTNS0Probability *_cLUE_SOLVER_RESTNS0Probability;
  xmlTextReaderPtr reader = xmlReaderForMemory([xml bytes], [xml length], NULL, NULL, 0);
  if (reader == NULL) {
    [NSException raise: @"XMLReadError"
                 format: @"Error instantiating an XML reader."];
    return nil;
  }

  _cLUE_SOLVER_RESTNS0Probability = (CLUE_SOLVER_RESTNS0Probability *) [CLUE_SOLVER_RESTNS0Probability readXMLElement: reader];
  xmlFreeTextReader(reader); //free the reader
  return _cLUE_SOLVER_RESTNS0Probability;
}

//documentation inherited.
- (NSData *) writeToXML
{
  xmlBufferPtr buf;
  xmlTextWriterPtr writer;
  int rc;
  NSData *data;

  buf = xmlBufferCreate();
  if (buf == NULL) {
    [NSException raise: @"XMLWriteError"
                 format: @"Error creating an XML buffer."];
    return nil;
  }

  writer = xmlNewTextWriterMemory(buf, 0);
  if (writer == NULL) {
    xmlBufferFree(buf);
    [NSException raise: @"XMLWriteError"
                 format: @"Error creating an XML writer."];
    return nil;
  }

  rc = xmlTextWriterStartDocument(writer, NULL, "utf-8", NULL);
  if (rc < 0) {
    xmlFreeTextWriter(writer);
    xmlBufferFree(buf);
    [NSException raise: @"XMLWriteError"
                 format: @"Error writing XML start document."];
    return nil;
  }

  NS_DURING
  {
    [self writeXMLElement: writer];
  }
  NS_HANDLER
  {
    xmlFreeTextWriter(writer);
    xmlBufferFree(buf);
    [localException raise];
  }
  NS_ENDHANDLER

  rc = xmlTextWriterEndDocument(writer);
  if (rc < 0) {
    xmlFreeTextWriter(writer);
    xmlBufferFree(buf);
    [NSException raise: @"XMLWriteError"
                 format: @"Error writing XML end document."];
    return nil;
  }

  xmlFreeTextWriter(writer);
  data = [NSData dataWithBytes: buf->content length: buf->use];
  xmlBufferFree(buf);
  return data;
}
@end /* implementation CLUE_SOLVER_RESTNS0Probability */

/**
 * Internal, private interface for JAXB reading and writing.
 */
@interface CLUE_SOLVER_RESTNS0Probability (JAXB) <JAXBReading, JAXBWriting, JAXBType, JAXBElement>

@end /*interface CLUE_SOLVER_RESTNS0Probability (JAXB)*/

/**
 * Internal, private implementation for JAXB reading and writing.
 */
@implementation CLUE_SOLVER_RESTNS0Probability (JAXB)

/**
 * Read an instance of CLUE_SOLVER_RESTNS0Probability from an XML reader.
 *
 * @param reader The reader.
 * @return An instance of CLUE_SOLVER_RESTNS0Probability defined by the XML reader.
 */
+ (id<JAXBType>) readXMLType: (xmlTextReaderPtr) reader
{
  CLUE_SOLVER_RESTNS0Probability *_cLUE_SOLVER_RESTNS0Probability = [[CLUE_SOLVER_RESTNS0Probability alloc] init];
  NS_DURING
  {
    [_cLUE_SOLVER_RESTNS0Probability initWithReader: reader];
  }
  NS_HANDLER
  {
    _cLUE_SOLVER_RESTNS0Probability = nil;
    [localException raise];
  }
  NS_ENDHANDLER

  [_cLUE_SOLVER_RESTNS0Probability autorelease];
  return _cLUE_SOLVER_RESTNS0Probability;
}

/**
 * Initialize this instance of CLUE_SOLVER_RESTNS0Probability according to
 * the XML being read from the reader.
 *
 * @param reader The reader.
 */
- (id) initWithReader: (xmlTextReaderPtr) reader
{
  return [super initWithReader: reader];
}

/**
 * Write the XML for this instance of CLUE_SOLVER_RESTNS0Probability to the writer.
 * Note that since we're only writing the XML type,
 * No start/end element will be written.
 *
 * @param reader The reader.
 */
- (void) writeXMLType: (xmlTextWriterPtr) writer
{
  [super writeXMLType:writer];
}

/**
 * Reads a CLUE_SOLVER_RESTNS0Probability from an XML reader. The element to be read is
 * "cardProbability".
 *
 * @param reader The XML reader.
 * @return The CLUE_SOLVER_RESTNS0Probability.
 */
+ (id<JAXBElement>) readXMLElement: (xmlTextReaderPtr) reader {
  int status;
  CLUE_SOLVER_RESTNS0Probability *_probability = nil;

  if (xmlTextReaderNodeType(reader) != XML_READER_TYPE_ELEMENT) {
    status = xmlTextReaderAdvanceToNextStartOrEndElement(reader);
    if (status < 1) {
      [NSException raise: @"XMLReadError"
                   format: @"Error advancing the reader to start element cardProbability."];
    }
  }

  if (xmlStrcmp(BAD_CAST "cardProbability", xmlTextReaderConstLocalName(reader)) == 0
      && xmlTextReaderConstNamespaceUri(reader) == NULL) {
#if DEBUG_ENUNCIATE > 1
    NSLog(@"Attempting to read root element {}cardProbability.");
#endif
    _probability = (CLUE_SOLVER_RESTNS0Probability *)[CLUE_SOLVER_RESTNS0Probability readXMLType: reader];
#if DEBUG_ENUNCIATE > 1
    NSLog(@"Successfully read root element {}cardProbability.");
#endif
  }
  else {
    if (xmlTextReaderConstNamespaceUri(reader) == NULL) {
      [NSException raise: @"XMLReadError"
                   format: @"Unable to read CLUE_SOLVER_RESTNS0Probability. Expected element cardProbability. Current element: {}%s", xmlTextReaderConstLocalName(reader)];
    }
    else {
      [NSException raise: @"XMLReadError"
                   format: @"Unable to read CLUE_SOLVER_RESTNS0Probability. Expected element cardProbability. Current element: {%s}%s\n", xmlTextReaderConstNamespaceUri(reader), xmlTextReaderConstLocalName(reader)];
    }
  }

  return _probability;
}

/**
 * Writes this CLUE_SOLVER_RESTNS0Probability to XML under element name "cardProbability".
 * The namespace declarations for the element will be written.
 *
 * @param writer The XML writer.
 * @param _probability The Probability to write.
 * @return 1 if successful, 0 otherwise.
 */
- (void) writeXMLElement: (xmlTextWriterPtr) writer
{
  [self writeXMLElement: writer writeNamespaces: YES];
}

/**
 * Writes this CLUE_SOLVER_RESTNS0Probability to an XML writer.
 *
 * @param writer The writer.
 * @param writeNs Whether to write the namespaces for this element to the xml writer.
 */
- (void) writeXMLElement: (xmlTextWriterPtr) writer writeNamespaces: (BOOL) writeNs
{
  int rc = xmlTextWriterStartElementNS(writer, NULL, BAD_CAST "cardProbability", NULL);
  if (rc < 0) {
    [NSException raise: @"XMLWriteError"
                 format: @"Error writing start element {}cardProbability. XML writer status: %i\n", rc];
  }

#if DEBUG_ENUNCIATE > 1
  NSLog(@"writing type {}probability for root element {}cardProbability...");
#endif
  [self writeXMLType: writer];
#if DEBUG_ENUNCIATE > 1
  NSLog(@"successfully wrote type {}probability for root element {}cardProbability...");
#endif
  rc = xmlTextWriterEndElement(writer);
  if (rc < 0) {
    [NSException raise: @"XMLWriteError"
                 format: @"Error writing end element {}cardProbability. XML writer status: %i\n", rc];
  }
}

//documentation inherited.
- (BOOL) readJAXBAttribute: (xmlTextReaderPtr) reader
{
  void *_child_accessor;

  if ([super readJAXBAttribute: reader]) {
    return YES;
  }

  if ((xmlStrcmp(BAD_CAST "chance", xmlTextReaderConstLocalName(reader)) == 0) && (xmlTextReaderConstNamespaceUri(reader) == NULL)) {
#if DEBUG_ENUNCIATE > 1
    NSLog(@"Attempting to read attribute {}chance...");
#endif
    _child_accessor = xmlTextReaderReadDoubleType(reader);
    if (_child_accessor == NULL) {
      //panic: unable to read the attribute value for some reason.
      [NSException raise: @"XMLReadError"
                   format: @"Error reading attribute {}chance."];
    }
    [self setCardProbability: *((double*) _child_accessor)];
    free(_child_accessor);
#if DEBUG_ENUNCIATE > 1
    NSLog(@"successfully read attribute {}chance...");
#endif
    return YES;
  }

  return NO;
}

//documentation inherited.
- (BOOL) readJAXBValue: (xmlTextReaderPtr) reader
{
  return [super readJAXBValue: reader];
}

//documentation inherited.
- (BOOL) readJAXBChildElement: (xmlTextReaderPtr) reader
{
  id __child;
  void *_child_accessor;
  int status, depth;

  if ([super readJAXBChildElement: reader]) {
    return YES;
  }

  return NO;
}

//documentation inherited.
- (int) readUnknownJAXBChildElement: (xmlTextReaderPtr) reader
{
  JAXBBasicXMLNode *node = (JAXBBasicXMLNode *) [JAXBBasicXMLNode readXMLType: reader];
  if ([self wrappedObject]) {
    [self setWrappedObject: [[self wrappedObject] arrayByAddingObject: node]];
  }
  else {
    [self setWrappedObject: [NSArray arrayWithObject: node]];
  }
  return 1;
}

//documentation inherited.
- (void) readUnknownJAXBAttribute: (xmlTextReaderPtr) reader
{
  [super readUnknownJAXBAttribute: reader];
}

//documentation inherited.
- (void) writeJAXBAttributes: (xmlTextWriterPtr) writer
{
  int status;

  [super writeJAXBAttributes: writer];

  if (YES) { //always write the primitive attributes...

    status = xmlTextWriterStartAttributeNS(writer, NULL, BAD_CAST "chance", NULL);
    if (status < 0) {
      [NSException raise: @"XMLWriteError"
                   format: @"Error writing start attribute {}chance."];
    }

#if DEBUG_ENUNCIATE > 1
    NSLog(@"writing attribute {}chance...");
#endif
    status = xmlTextWriterWriteDoubleType(writer, &_cardProbability);
    if (status < 0) {
      [NSException raise: @"XMLWriteError"
                   format: @"Error writing attribute {}chance."];
    }
#if DEBUG_ENUNCIATE > 1
    NSLog(@"successfully wrote attribute {}chance...");
#endif

    status = xmlTextWriterEndAttribute(writer);
    if (status < 0) {
      [NSException raise: @"XMLWriteError"
                   format: @"Error writing end attribute {}chance."];
    }
  }
}

//documentation inherited.
- (void) writeJAXBValue: (xmlTextWriterPtr) writer
{
  [super writeJAXBValue: writer];
}

/**
 * Method for writing the child elements.
 *
 * @param writer The writer.
 */
- (void) writeJAXBChildElements: (xmlTextWriterPtr) writer
{
  int status;
  id __item;
  NSEnumerator *__enumerator;

  [super writeJAXBChildElements: writer];

}
@end /* implementation CLUE_SOLVER_RESTNS0Probability (JAXB) */

#endif /* DEF_CLUE_SOLVER_RESTNS0Probability_M */
#ifndef DEF_CLUE_SOLVER_RESTNS0Triple_M
#define DEF_CLUE_SOLVER_RESTNS0Triple_M

/**
 * (no documentation provided)
 */
@implementation CLUE_SOLVER_RESTNS0Triple

/**
 * (no documentation provided)
 */
- (CLUE_SOLVER_RESTNS0Suspect *) suspect
{
  return _suspect;
}

/**
 * (no documentation provided)
 */
- (void) setSuspect: (CLUE_SOLVER_RESTNS0Suspect *) newSuspect
{
  [newSuspect retain];
  [_suspect release];
  _suspect = newSuspect;
}

/**
 * (no documentation provided)
 */
- (CLUE_SOLVER_RESTNS0Room *) room
{
  return _room;
}

/**
 * (no documentation provided)
 */
- (void) setRoom: (CLUE_SOLVER_RESTNS0Room *) newRoom
{
  [newRoom retain];
  [_room release];
  _room = newRoom;
}

/**
 * (no documentation provided)
 */
- (CLUE_SOLVER_RESTNS0Weapon *) weapon
{
  return _weapon;
}

/**
 * (no documentation provided)
 */
- (void) setWeapon: (CLUE_SOLVER_RESTNS0Weapon *) newWeapon
{
  [newWeapon retain];
  [_weapon release];
  _weapon = newWeapon;
}

- (void) dealloc
{
  [self setSuspect: nil];
  [self setRoom: nil];
  [self setWeapon: nil];
  [super dealloc];
}

//documentation inherited.
+ (id<EnunciateXML>) readFromXML: (NSData *) xml
{
  CLUE_SOLVER_RESTNS0Triple *_cLUE_SOLVER_RESTNS0Triple;
  xmlTextReaderPtr reader = xmlReaderForMemory([xml bytes], [xml length], NULL, NULL, 0);
  if (reader == NULL) {
    [NSException raise: @"XMLReadError"
                 format: @"Error instantiating an XML reader."];
    return nil;
  }

  _cLUE_SOLVER_RESTNS0Triple = (CLUE_SOLVER_RESTNS0Triple *) [CLUE_SOLVER_RESTNS0Triple readXMLElement: reader];
  xmlFreeTextReader(reader); //free the reader
  return _cLUE_SOLVER_RESTNS0Triple;
}

//documentation inherited.
- (NSData *) writeToXML
{
  xmlBufferPtr buf;
  xmlTextWriterPtr writer;
  int rc;
  NSData *data;

  buf = xmlBufferCreate();
  if (buf == NULL) {
    [NSException raise: @"XMLWriteError"
                 format: @"Error creating an XML buffer."];
    return nil;
  }

  writer = xmlNewTextWriterMemory(buf, 0);
  if (writer == NULL) {
    xmlBufferFree(buf);
    [NSException raise: @"XMLWriteError"
                 format: @"Error creating an XML writer."];
    return nil;
  }

  rc = xmlTextWriterStartDocument(writer, NULL, "utf-8", NULL);
  if (rc < 0) {
    xmlFreeTextWriter(writer);
    xmlBufferFree(buf);
    [NSException raise: @"XMLWriteError"
                 format: @"Error writing XML start document."];
    return nil;
  }

  NS_DURING
  {
    [self writeXMLElement: writer];
  }
  NS_HANDLER
  {
    xmlFreeTextWriter(writer);
    xmlBufferFree(buf);
    [localException raise];
  }
  NS_ENDHANDLER

  rc = xmlTextWriterEndDocument(writer);
  if (rc < 0) {
    xmlFreeTextWriter(writer);
    xmlBufferFree(buf);
    [NSException raise: @"XMLWriteError"
                 format: @"Error writing XML end document."];
    return nil;
  }

  xmlFreeTextWriter(writer);
  data = [NSData dataWithBytes: buf->content length: buf->use];
  xmlBufferFree(buf);
  return data;
}
@end /* implementation CLUE_SOLVER_RESTNS0Triple */

/**
 * Internal, private interface for JAXB reading and writing.
 */
@interface CLUE_SOLVER_RESTNS0Triple (JAXB) <JAXBReading, JAXBWriting, JAXBType, JAXBElement>

@end /*interface CLUE_SOLVER_RESTNS0Triple (JAXB)*/

/**
 * Internal, private implementation for JAXB reading and writing.
 */
@implementation CLUE_SOLVER_RESTNS0Triple (JAXB)

/**
 * Read an instance of CLUE_SOLVER_RESTNS0Triple from an XML reader.
 *
 * @param reader The reader.
 * @return An instance of CLUE_SOLVER_RESTNS0Triple defined by the XML reader.
 */
+ (id<JAXBType>) readXMLType: (xmlTextReaderPtr) reader
{
  CLUE_SOLVER_RESTNS0Triple *_cLUE_SOLVER_RESTNS0Triple = [[CLUE_SOLVER_RESTNS0Triple alloc] init];
  NS_DURING
  {
    [_cLUE_SOLVER_RESTNS0Triple initWithReader: reader];
  }
  NS_HANDLER
  {
    _cLUE_SOLVER_RESTNS0Triple = nil;
    [localException raise];
  }
  NS_ENDHANDLER

  [_cLUE_SOLVER_RESTNS0Triple autorelease];
  return _cLUE_SOLVER_RESTNS0Triple;
}

/**
 * Initialize this instance of CLUE_SOLVER_RESTNS0Triple according to
 * the XML being read from the reader.
 *
 * @param reader The reader.
 */
- (id) initWithReader: (xmlTextReaderPtr) reader
{
  return [super initWithReader: reader];
}

/**
 * Write the XML for this instance of CLUE_SOLVER_RESTNS0Triple to the writer.
 * Note that since we're only writing the XML type,
 * No start/end element will be written.
 *
 * @param reader The reader.
 */
- (void) writeXMLType: (xmlTextWriterPtr) writer
{
  [super writeXMLType:writer];
}

/**
 * Reads a CLUE_SOLVER_RESTNS0Triple from an XML reader. The element to be read is
 * "triple".
 *
 * @param reader The XML reader.
 * @return The CLUE_SOLVER_RESTNS0Triple.
 */
+ (id<JAXBElement>) readXMLElement: (xmlTextReaderPtr) reader {
  int status;
  CLUE_SOLVER_RESTNS0Triple *_triple = nil;

  if (xmlTextReaderNodeType(reader) != XML_READER_TYPE_ELEMENT) {
    status = xmlTextReaderAdvanceToNextStartOrEndElement(reader);
    if (status < 1) {
      [NSException raise: @"XMLReadError"
                   format: @"Error advancing the reader to start element triple."];
    }
  }

  if (xmlStrcmp(BAD_CAST "triple", xmlTextReaderConstLocalName(reader)) == 0
      && xmlTextReaderConstNamespaceUri(reader) == NULL) {
#if DEBUG_ENUNCIATE > 1
    NSLog(@"Attempting to read root element {}triple.");
#endif
    _triple = (CLUE_SOLVER_RESTNS0Triple *)[CLUE_SOLVER_RESTNS0Triple readXMLType: reader];
#if DEBUG_ENUNCIATE > 1
    NSLog(@"Successfully read root element {}triple.");
#endif
  }
  else {
    if (xmlTextReaderConstNamespaceUri(reader) == NULL) {
      [NSException raise: @"XMLReadError"
                   format: @"Unable to read CLUE_SOLVER_RESTNS0Triple. Expected element triple. Current element: {}%s", xmlTextReaderConstLocalName(reader)];
    }
    else {
      [NSException raise: @"XMLReadError"
                   format: @"Unable to read CLUE_SOLVER_RESTNS0Triple. Expected element triple. Current element: {%s}%s\n", xmlTextReaderConstNamespaceUri(reader), xmlTextReaderConstLocalName(reader)];
    }
  }

  return _triple;
}

/**
 * Writes this CLUE_SOLVER_RESTNS0Triple to XML under element name "triple".
 * The namespace declarations for the element will be written.
 *
 * @param writer The XML writer.
 * @param _triple The Triple to write.
 * @return 1 if successful, 0 otherwise.
 */
- (void) writeXMLElement: (xmlTextWriterPtr) writer
{
  [self writeXMLElement: writer writeNamespaces: YES];
}

/**
 * Writes this CLUE_SOLVER_RESTNS0Triple to an XML writer.
 *
 * @param writer The writer.
 * @param writeNs Whether to write the namespaces for this element to the xml writer.
 */
- (void) writeXMLElement: (xmlTextWriterPtr) writer writeNamespaces: (BOOL) writeNs
{
  int rc = xmlTextWriterStartElementNS(writer, NULL, BAD_CAST "triple", NULL);
  if (rc < 0) {
    [NSException raise: @"XMLWriteError"
                 format: @"Error writing start element {}triple. XML writer status: %i\n", rc];
  }

#if DEBUG_ENUNCIATE > 1
  NSLog(@"writing type {}triple for root element {}triple...");
#endif
  [self writeXMLType: writer];
#if DEBUG_ENUNCIATE > 1
  NSLog(@"successfully wrote type {}triple for root element {}triple...");
#endif
  rc = xmlTextWriterEndElement(writer);
  if (rc < 0) {
    [NSException raise: @"XMLWriteError"
                 format: @"Error writing end element {}triple. XML writer status: %i\n", rc];
  }
}

//documentation inherited.
- (BOOL) readJAXBAttribute: (xmlTextReaderPtr) reader
{
  void *_child_accessor;

  if ([super readJAXBAttribute: reader]) {
    return YES;
  }

  return NO;
}

//documentation inherited.
- (BOOL) readJAXBValue: (xmlTextReaderPtr) reader
{
  return [super readJAXBValue: reader];
}

//documentation inherited.
- (BOOL) readJAXBChildElement: (xmlTextReaderPtr) reader
{
  id __child;
  void *_child_accessor;
  int status, depth;

  if ([super readJAXBChildElement: reader]) {
    return YES;
  }
  if (xmlTextReaderNodeType(reader) == XML_READER_TYPE_ELEMENT
    && xmlStrcmp(BAD_CAST "suspect", xmlTextReaderConstLocalName(reader)) == 0
    && xmlTextReaderConstNamespaceUri(reader) == NULL) {

#if DEBUG_ENUNCIATE > 1
    NSLog(@"Attempting to read choice {}suspect of type {}suspect.");
#endif
    __child = [CLUE_SOLVER_RESTNS0Suspect readXMLType: reader];
#if DEBUG_ENUNCIATE > 1
    NSLog(@"successfully read choice {}suspect of type {}suspect.");
#endif

    [self setSuspect: __child];
    return YES;
  } //end "if choice"

  if (xmlTextReaderNodeType(reader) == XML_READER_TYPE_ELEMENT
    && xmlStrcmp(BAD_CAST "room", xmlTextReaderConstLocalName(reader)) == 0
    && xmlTextReaderConstNamespaceUri(reader) == NULL) {

#if DEBUG_ENUNCIATE > 1
    NSLog(@"Attempting to read choice {}room of type {}room.");
#endif
    __child = [CLUE_SOLVER_RESTNS0Room readXMLType: reader];
#if DEBUG_ENUNCIATE > 1
    NSLog(@"successfully read choice {}room of type {}room.");
#endif

    [self setRoom: __child];
    return YES;
  } //end "if choice"

  if (xmlTextReaderNodeType(reader) == XML_READER_TYPE_ELEMENT
    && xmlStrcmp(BAD_CAST "weapon", xmlTextReaderConstLocalName(reader)) == 0
    && xmlTextReaderConstNamespaceUri(reader) == NULL) {

#if DEBUG_ENUNCIATE > 1
    NSLog(@"Attempting to read choice {}weapon of type {}weapon.");
#endif
    __child = [CLUE_SOLVER_RESTNS0Weapon readXMLType: reader];
#if DEBUG_ENUNCIATE > 1
    NSLog(@"successfully read choice {}weapon of type {}weapon.");
#endif

    [self setWeapon: __child];
    return YES;
  } //end "if choice"


  return NO;
}

//documentation inherited.
- (int) readUnknownJAXBChildElement: (xmlTextReaderPtr) reader
{
  return [super readUnknownJAXBChildElement: reader];
}

//documentation inherited.
- (void) readUnknownJAXBAttribute: (xmlTextReaderPtr) reader
{
  [super readUnknownJAXBAttribute: reader];
}

//documentation inherited.
- (void) writeJAXBAttributes: (xmlTextWriterPtr) writer
{
  int status;

  [super writeJAXBAttributes: writer];

}

//documentation inherited.
- (void) writeJAXBValue: (xmlTextWriterPtr) writer
{
  [super writeJAXBValue: writer];
}

/**
 * Method for writing the child elements.
 *
 * @param writer The writer.
 */
- (void) writeJAXBChildElements: (xmlTextWriterPtr) writer
{
  int status;
  id __item;
  NSEnumerator *__enumerator;

  [super writeJAXBChildElements: writer];

  if ([self suspect]) {
    status = xmlTextWriterStartElementNS(writer, NULL, BAD_CAST "suspect", NULL);
    if (status < 0) {
      [NSException raise: @"XMLWriteError"
                   format: @"Error writing start child element {}suspect."];
    }

#if DEBUG_ENUNCIATE > 1
    NSLog(@"writing element {}suspect...");
#endif
    [[self suspect] writeXMLType: writer];
#if DEBUG_ENUNCIATE > 1
    NSLog(@"successfully wrote element {}suspect...");
#endif

    status = xmlTextWriterEndElement(writer);
    if (status < 0) {
      [NSException raise: @"XMLWriteError"
                   format: @"Error writing end child element {}suspect."];
    }
  }
  if ([self room]) {
    status = xmlTextWriterStartElementNS(writer, NULL, BAD_CAST "room", NULL);
    if (status < 0) {
      [NSException raise: @"XMLWriteError"
                   format: @"Error writing start child element {}room."];
    }

#if DEBUG_ENUNCIATE > 1
    NSLog(@"writing element {}room...");
#endif
    [[self room] writeXMLType: writer];
#if DEBUG_ENUNCIATE > 1
    NSLog(@"successfully wrote element {}room...");
#endif

    status = xmlTextWriterEndElement(writer);
    if (status < 0) {
      [NSException raise: @"XMLWriteError"
                   format: @"Error writing end child element {}room."];
    }
  }
  if ([self weapon]) {
    status = xmlTextWriterStartElementNS(writer, NULL, BAD_CAST "weapon", NULL);
    if (status < 0) {
      [NSException raise: @"XMLWriteError"
                   format: @"Error writing start child element {}weapon."];
    }

#if DEBUG_ENUNCIATE > 1
    NSLog(@"writing element {}weapon...");
#endif
    [[self weapon] writeXMLType: writer];
#if DEBUG_ENUNCIATE > 1
    NSLog(@"successfully wrote element {}weapon...");
#endif

    status = xmlTextWriterEndElement(writer);
    if (status < 0) {
      [NSException raise: @"XMLWriteError"
                   format: @"Error writing end child element {}weapon."];
    }
  }
}
@end /* implementation CLUE_SOLVER_RESTNS0Triple (JAXB) */

#endif /* DEF_CLUE_SOLVER_RESTNS0Triple_M */
#ifndef DEF_CLUE_SOLVER_RESTNS0ClueServerStatus_M
#define DEF_CLUE_SOLVER_RESTNS0ClueServerStatus_M

/**
 * (no documentation provided)
 */
@implementation CLUE_SOLVER_RESTNS0ClueServerStatus

/**
 * (no documentation provided)
 */
- (NSArray *) remainingTriples
{
  return _remainingTriples;
}

/**
 * (no documentation provided)
 */
- (void) setRemainingTriples: (NSArray *) newRemainingTriples
{
  [newRemainingTriples retain];
  [_remainingTriples release];
  _remainingTriples = newRemainingTriples;
}

/**
 * (no documentation provided)
 */
- (NSArray *) remainingCards
{
  return _remainingCards;
}

/**
 * (no documentation provided)
 */
- (void) setRemainingCards: (NSArray *) newRemainingCards
{
  [newRemainingCards retain];
  [_remainingCards release];
  _remainingCards = newRemainingCards;
}

- (void) dealloc
{
  [self setRemainingTriples: nil];
  [self setRemainingCards: nil];
  [super dealloc];
}

//documentation inherited.
+ (id<EnunciateXML>) readFromXML: (NSData *) xml
{
  CLUE_SOLVER_RESTNS0ClueServerStatus *_cLUE_SOLVER_RESTNS0ClueServerStatus;
  xmlTextReaderPtr reader = xmlReaderForMemory([xml bytes], [xml length], NULL, NULL, 0);
  if (reader == NULL) {
    [NSException raise: @"XMLReadError"
                 format: @"Error instantiating an XML reader."];
    return nil;
  }

  _cLUE_SOLVER_RESTNS0ClueServerStatus = (CLUE_SOLVER_RESTNS0ClueServerStatus *) [CLUE_SOLVER_RESTNS0ClueServerStatus readXMLElement: reader];
  xmlFreeTextReader(reader); //free the reader
  return _cLUE_SOLVER_RESTNS0ClueServerStatus;
}

//documentation inherited.
- (NSData *) writeToXML
{
  xmlBufferPtr buf;
  xmlTextWriterPtr writer;
  int rc;
  NSData *data;

  buf = xmlBufferCreate();
  if (buf == NULL) {
    [NSException raise: @"XMLWriteError"
                 format: @"Error creating an XML buffer."];
    return nil;
  }

  writer = xmlNewTextWriterMemory(buf, 0);
  if (writer == NULL) {
    xmlBufferFree(buf);
    [NSException raise: @"XMLWriteError"
                 format: @"Error creating an XML writer."];
    return nil;
  }

  rc = xmlTextWriterStartDocument(writer, NULL, "utf-8", NULL);
  if (rc < 0) {
    xmlFreeTextWriter(writer);
    xmlBufferFree(buf);
    [NSException raise: @"XMLWriteError"
                 format: @"Error writing XML start document."];
    return nil;
  }

  NS_DURING
  {
    [self writeXMLElement: writer];
  }
  NS_HANDLER
  {
    xmlFreeTextWriter(writer);
    xmlBufferFree(buf);
    [localException raise];
  }
  NS_ENDHANDLER

  rc = xmlTextWriterEndDocument(writer);
  if (rc < 0) {
    xmlFreeTextWriter(writer);
    xmlBufferFree(buf);
    [NSException raise: @"XMLWriteError"
                 format: @"Error writing XML end document."];
    return nil;
  }

  xmlFreeTextWriter(writer);
  data = [NSData dataWithBytes: buf->content length: buf->use];
  xmlBufferFree(buf);
  return data;
}
@end /* implementation CLUE_SOLVER_RESTNS0ClueServerStatus */

/**
 * Internal, private interface for JAXB reading and writing.
 */
@interface CLUE_SOLVER_RESTNS0ClueServerStatus (JAXB) <JAXBReading, JAXBWriting, JAXBType, JAXBElement>

@end /*interface CLUE_SOLVER_RESTNS0ClueServerStatus (JAXB)*/

/**
 * Internal, private implementation for JAXB reading and writing.
 */
@implementation CLUE_SOLVER_RESTNS0ClueServerStatus (JAXB)

/**
 * Read an instance of CLUE_SOLVER_RESTNS0ClueServerStatus from an XML reader.
 *
 * @param reader The reader.
 * @return An instance of CLUE_SOLVER_RESTNS0ClueServerStatus defined by the XML reader.
 */
+ (id<JAXBType>) readXMLType: (xmlTextReaderPtr) reader
{
  CLUE_SOLVER_RESTNS0ClueServerStatus *_cLUE_SOLVER_RESTNS0ClueServerStatus = [[CLUE_SOLVER_RESTNS0ClueServerStatus alloc] init];
  NS_DURING
  {
    [_cLUE_SOLVER_RESTNS0ClueServerStatus initWithReader: reader];
  }
  NS_HANDLER
  {
    _cLUE_SOLVER_RESTNS0ClueServerStatus = nil;
    [localException raise];
  }
  NS_ENDHANDLER

  [_cLUE_SOLVER_RESTNS0ClueServerStatus autorelease];
  return _cLUE_SOLVER_RESTNS0ClueServerStatus;
}

/**
 * Initialize this instance of CLUE_SOLVER_RESTNS0ClueServerStatus according to
 * the XML being read from the reader.
 *
 * @param reader The reader.
 */
- (id) initWithReader: (xmlTextReaderPtr) reader
{
  return [super initWithReader: reader];
}

/**
 * Write the XML for this instance of CLUE_SOLVER_RESTNS0ClueServerStatus to the writer.
 * Note that since we're only writing the XML type,
 * No start/end element will be written.
 *
 * @param reader The reader.
 */
- (void) writeXMLType: (xmlTextWriterPtr) writer
{
  [super writeXMLType:writer];
}

/**
 * Reads a CLUE_SOLVER_RESTNS0ClueServerStatus from an XML reader. The element to be read is
 * "status".
 *
 * @param reader The XML reader.
 * @return The CLUE_SOLVER_RESTNS0ClueServerStatus.
 */
+ (id<JAXBElement>) readXMLElement: (xmlTextReaderPtr) reader {
  int status;
  CLUE_SOLVER_RESTNS0ClueServerStatus *_clueServerStatus = nil;

  if (xmlTextReaderNodeType(reader) != XML_READER_TYPE_ELEMENT) {
    status = xmlTextReaderAdvanceToNextStartOrEndElement(reader);
    if (status < 1) {
      [NSException raise: @"XMLReadError"
                   format: @"Error advancing the reader to start element status."];
    }
  }

  if (xmlStrcmp(BAD_CAST "status", xmlTextReaderConstLocalName(reader)) == 0
      && xmlTextReaderConstNamespaceUri(reader) == NULL) {
#if DEBUG_ENUNCIATE > 1
    NSLog(@"Attempting to read root element {}status.");
#endif
    _clueServerStatus = (CLUE_SOLVER_RESTNS0ClueServerStatus *)[CLUE_SOLVER_RESTNS0ClueServerStatus readXMLType: reader];
#if DEBUG_ENUNCIATE > 1
    NSLog(@"Successfully read root element {}status.");
#endif
  }
  else {
    if (xmlTextReaderConstNamespaceUri(reader) == NULL) {
      [NSException raise: @"XMLReadError"
                   format: @"Unable to read CLUE_SOLVER_RESTNS0ClueServerStatus. Expected element status. Current element: {}%s", xmlTextReaderConstLocalName(reader)];
    }
    else {
      [NSException raise: @"XMLReadError"
                   format: @"Unable to read CLUE_SOLVER_RESTNS0ClueServerStatus. Expected element status. Current element: {%s}%s\n", xmlTextReaderConstNamespaceUri(reader), xmlTextReaderConstLocalName(reader)];
    }
  }

  return _clueServerStatus;
}

/**
 * Writes this CLUE_SOLVER_RESTNS0ClueServerStatus to XML under element name "status".
 * The namespace declarations for the element will be written.
 *
 * @param writer The XML writer.
 * @param _clueServerStatus The ClueServerStatus to write.
 * @return 1 if successful, 0 otherwise.
 */
- (void) writeXMLElement: (xmlTextWriterPtr) writer
{
  [self writeXMLElement: writer writeNamespaces: YES];
}

/**
 * Writes this CLUE_SOLVER_RESTNS0ClueServerStatus to an XML writer.
 *
 * @param writer The writer.
 * @param writeNs Whether to write the namespaces for this element to the xml writer.
 */
- (void) writeXMLElement: (xmlTextWriterPtr) writer writeNamespaces: (BOOL) writeNs
{
  int rc = xmlTextWriterStartElementNS(writer, NULL, BAD_CAST "status", NULL);
  if (rc < 0) {
    [NSException raise: @"XMLWriteError"
                 format: @"Error writing start element {}status. XML writer status: %i\n", rc];
  }

#if DEBUG_ENUNCIATE > 1
  NSLog(@"writing type {}clueServerStatus for root element {}status...");
#endif
  [self writeXMLType: writer];
#if DEBUG_ENUNCIATE > 1
  NSLog(@"successfully wrote type {}clueServerStatus for root element {}status...");
#endif
  rc = xmlTextWriterEndElement(writer);
  if (rc < 0) {
    [NSException raise: @"XMLWriteError"
                 format: @"Error writing end element {}status. XML writer status: %i\n", rc];
  }
}

//documentation inherited.
- (BOOL) readJAXBAttribute: (xmlTextReaderPtr) reader
{
  void *_child_accessor;

  if ([super readJAXBAttribute: reader]) {
    return YES;
  }

  return NO;
}

//documentation inherited.
- (BOOL) readJAXBValue: (xmlTextReaderPtr) reader
{
  return [super readJAXBValue: reader];
}

//documentation inherited.
- (BOOL) readJAXBChildElement: (xmlTextReaderPtr) reader
{
  id __child;
  void *_child_accessor;
  int status, depth;

  if ([super readJAXBChildElement: reader]) {
    return YES;
  }
  if (xmlTextReaderNodeType(reader) == XML_READER_TYPE_ELEMENT
    && xmlStrcmp(BAD_CAST "remainingTriples", xmlTextReaderConstLocalName(reader)) == 0
    && xmlTextReaderConstNamespaceUri(reader) == NULL) {

    if (xmlTextReaderIsEmptyElement(reader) == 0) {
#if DEBUG_ENUNCIATE > 1
      NSLog(@"Unwrapping wrapper element {}remainingTriples...");
#endif
      //start wrapper element "{}remainingTriples"
      depth = xmlTextReaderDepth(reader);
      status = xmlTextReaderAdvanceToNextStartOrEndElement(reader);
      while (xmlTextReaderDepth(reader) > depth) {
        if (status < 1) {
          //panic: XML read error.
          [NSException raise: @"XMLReadError"
                       format: @"Failure to advance to next wrapped child element."];
        }
  if (xmlTextReaderNodeType(reader) == XML_READER_TYPE_ELEMENT
    && xmlStrcmp(BAD_CAST "triple", xmlTextReaderConstLocalName(reader)) == 0
    && xmlTextReaderConstNamespaceUri(reader) == NULL) {

#if DEBUG_ENUNCIATE > 1
    NSLog(@"Attempting to read choice {}triple of type {}triple.");
#endif

    __child = [CLUE_SOLVER_RESTNS0Triple readXMLType: reader];
#if DEBUG_ENUNCIATE > 1
    NSLog(@"successfully read choice {}triple of type {}triple.");
#endif

    if ([self remainingTriples]) {
      [self setRemainingTriples: [[self remainingTriples] arrayByAddingObject: __child]];
    }
    else {
      [self setRemainingTriples: [NSArray arrayWithObject: __child]];
    }
    continue; //continue "while in wrapper element" loop
  } //end "if choice"

        status = xmlTextReaderAdvanceToNextStartOrEndElement(reader);
#if DEBUG_ENUNCIATE > 1
        NSLog(@"successfully unwrapped wrapper element {}remainingTriples...");
#endif
      } // end "while in wrapper element" loop

      if (status < 1) {
        //panic: XML read error.
        [NSException raise: @"XMLReadError"
                     format: @"Failure to advance to end wrapper element."];
      }
      else {
        //end wrapper element "{}remainingTriples"
        status = xmlTextReaderAdvanceToNextStartOrEndElement(reader);
      }
    } //end "if empty element" clause
    else {
      __child = [NSArray array];
      [self setRemainingTriples: (NSArray*) __child];
    }

    return YES;
  } // end "if wrapper element" clause
  if (xmlTextReaderNodeType(reader) == XML_READER_TYPE_ELEMENT
    && xmlStrcmp(BAD_CAST "remainingCards", xmlTextReaderConstLocalName(reader)) == 0
    && xmlTextReaderConstNamespaceUri(reader) == NULL) {

    if (xmlTextReaderIsEmptyElement(reader) == 0) {
#if DEBUG_ENUNCIATE > 1
      NSLog(@"Unwrapping wrapper element {}remainingCards...");
#endif
      //start wrapper element "{}remainingCards"
      depth = xmlTextReaderDepth(reader);
      status = xmlTextReaderAdvanceToNextStartOrEndElement(reader);
      while (xmlTextReaderDepth(reader) > depth) {
        if (status < 1) {
          //panic: XML read error.
          [NSException raise: @"XMLReadError"
                       format: @"Failure to advance to next wrapped child element."];
        }
  if (xmlTextReaderNodeType(reader) == XML_READER_TYPE_ELEMENT
    && xmlStrcmp(BAD_CAST "card", xmlTextReaderConstLocalName(reader)) == 0
    && xmlTextReaderConstNamespaceUri(reader) == NULL) {

#if DEBUG_ENUNCIATE > 1
    NSLog(@"Attempting to read choice {}card of type {}card.");
#endif

    __child = [CLUE_SOLVER_RESTNS0Card readXMLType: reader];
#if DEBUG_ENUNCIATE > 1
    NSLog(@"successfully read choice {}card of type {}card.");
#endif

    if ([self remainingCards]) {
      [self setRemainingCards: [[self remainingCards] arrayByAddingObject: __child]];
    }
    else {
      [self setRemainingCards: [NSArray arrayWithObject: __child]];
    }
    continue; //continue "while in wrapper element" loop
  } //end "if choice"

        status = xmlTextReaderAdvanceToNextStartOrEndElement(reader);
#if DEBUG_ENUNCIATE > 1
        NSLog(@"successfully unwrapped wrapper element {}remainingCards...");
#endif
      } // end "while in wrapper element" loop

      if (status < 1) {
        //panic: XML read error.
        [NSException raise: @"XMLReadError"
                     format: @"Failure to advance to end wrapper element."];
      }
      else {
        //end wrapper element "{}remainingCards"
        status = xmlTextReaderAdvanceToNextStartOrEndElement(reader);
      }
    } //end "if empty element" clause
    else {
      __child = [NSArray array];
      [self setRemainingCards: (NSArray*) __child];
    }

    return YES;
  } // end "if wrapper element" clause

  return NO;
}

//documentation inherited.
- (int) readUnknownJAXBChildElement: (xmlTextReaderPtr) reader
{
  return [super readUnknownJAXBChildElement: reader];
}

//documentation inherited.
- (void) readUnknownJAXBAttribute: (xmlTextReaderPtr) reader
{
  [super readUnknownJAXBAttribute: reader];
}

//documentation inherited.
- (void) writeJAXBAttributes: (xmlTextWriterPtr) writer
{
  int status;

  [super writeJAXBAttributes: writer];

}

//documentation inherited.
- (void) writeJAXBValue: (xmlTextWriterPtr) writer
{
  [super writeJAXBValue: writer];
}

/**
 * Method for writing the child elements.
 *
 * @param writer The writer.
 */
- (void) writeJAXBChildElements: (xmlTextWriterPtr) writer
{
  int status;
  id __item;
  NSEnumerator *__enumerator;

  [super writeJAXBChildElements: writer];

  if ([self remainingTriples]) {
    status = xmlTextWriterStartElementNS(writer, NULL, BAD_CAST "remainingTriples", NULL);
    if (status < 0) {
      [NSException raise: @"XMLWriteError"
                   format: @"Error writing start wrapper element {}remainingTriples."];
    }
    __enumerator = [[self remainingTriples] objectEnumerator];

    while ( (__item = [__enumerator nextObject]) ) {
      status = xmlTextWriterStartElementNS(writer, NULL, BAD_CAST "triple", NULL);
      if (status < 0) {
        [NSException raise: @"XMLWriteError"
                     format: @"Error writing start child element {}triple."];
      }

#if DEBUG_ENUNCIATE > 1
      NSLog(@"writing element {}triple...");
#endif
      [__item writeXMLType: writer];
#if DEBUG_ENUNCIATE > 1
      NSLog(@"successfully wrote element {}triple...");
#endif

      status = xmlTextWriterEndElement(writer);
      if (status < 0) {
        [NSException raise: @"XMLWriteError"
                     format: @"Error writing end child element {}triple."];
      }
    } //end item iterator.

    status = xmlTextWriterEndElement(writer);
    if (status < 0) {
      [NSException raise: @"XMLWriteError"
                   format: @"Error writing end wrapper element {}remainingTriples."];
    }
  }
  if ([self remainingCards]) {
    status = xmlTextWriterStartElementNS(writer, NULL, BAD_CAST "remainingCards", NULL);
    if (status < 0) {
      [NSException raise: @"XMLWriteError"
                   format: @"Error writing start wrapper element {}remainingCards."];
    }
    __enumerator = [[self remainingCards] objectEnumerator];

    while ( (__item = [__enumerator nextObject]) ) {
      status = xmlTextWriterStartElementNS(writer, NULL, BAD_CAST "card", NULL);
      if (status < 0) {
        [NSException raise: @"XMLWriteError"
                     format: @"Error writing start child element {}card."];
      }

#if DEBUG_ENUNCIATE > 1
      NSLog(@"writing element {}card...");
#endif
      [__item writeXMLType: writer];
#if DEBUG_ENUNCIATE > 1
      NSLog(@"successfully wrote element {}card...");
#endif

      status = xmlTextWriterEndElement(writer);
      if (status < 0) {
        [NSException raise: @"XMLWriteError"
                     format: @"Error writing end child element {}card."];
      }
    } //end item iterator.

    status = xmlTextWriterEndElement(writer);
    if (status < 0) {
      [NSException raise: @"XMLWriteError"
                   format: @"Error writing end wrapper element {}remainingCards."];
    }
  }
}
@end /* implementation CLUE_SOLVER_RESTNS0ClueServerStatus (JAXB) */

#endif /* DEF_CLUE_SOLVER_RESTNS0ClueServerStatus_M */
#ifndef DEF_CLUE_SOLVER_RESTNS0ProbabilityReport_M
#define DEF_CLUE_SOLVER_RESTNS0ProbabilityReport_M

/**
 * (no documentation provided)
 */
@implementation CLUE_SOLVER_RESTNS0ProbabilityReport

/**
 * (no documentation provided)
 */
- (NSArray *) rooms
{
  return _rooms;
}

/**
 * (no documentation provided)
 */
- (void) setRooms: (NSArray *) newRooms
{
  [newRooms retain];
  [_rooms release];
  _rooms = newRooms;
}

/**
 * (no documentation provided)
 */
- (CLUE_SOLVER_RESTNS0Probability *) mostLikelyWeapon
{
  return _mostLikelyWeapon;
}

/**
 * (no documentation provided)
 */
- (void) setMostLikelyWeapon: (CLUE_SOLVER_RESTNS0Probability *) newMostLikelyWeapon
{
  [newMostLikelyWeapon retain];
  [_mostLikelyWeapon release];
  _mostLikelyWeapon = newMostLikelyWeapon;
}

/**
 * (no documentation provided)
 */
- (CLUE_SOLVER_RESTNS0Probability *) mostLikelyRoom
{
  return _mostLikelyRoom;
}

/**
 * (no documentation provided)
 */
- (void) setMostLikelyRoom: (CLUE_SOLVER_RESTNS0Probability *) newMostLikelyRoom
{
  [newMostLikelyRoom retain];
  [_mostLikelyRoom release];
  _mostLikelyRoom = newMostLikelyRoom;
}

/**
 * (no documentation provided)
 */
- (NSArray *) weapons
{
  return _weapons;
}

/**
 * (no documentation provided)
 */
- (void) setWeapons: (NSArray *) newWeapons
{
  [newWeapons retain];
  [_weapons release];
  _weapons = newWeapons;
}

/**
 * (no documentation provided)
 */
- (CLUE_SOLVER_RESTNS0Probability *) mostLikelyTriple
{
  return _mostLikelyTriple;
}

/**
 * (no documentation provided)
 */
- (void) setMostLikelyTriple: (CLUE_SOLVER_RESTNS0Probability *) newMostLikelyTriple
{
  [newMostLikelyTriple retain];
  [_mostLikelyTriple release];
  _mostLikelyTriple = newMostLikelyTriple;
}

/**
 * (no documentation provided)
 */
- (CLUE_SOLVER_RESTNS0Probability *) mostLikelySuspect
{
  return _mostLikelySuspect;
}

/**
 * (no documentation provided)
 */
- (void) setMostLikelySuspect: (CLUE_SOLVER_RESTNS0Probability *) newMostLikelySuspect
{
  [newMostLikelySuspect retain];
  [_mostLikelySuspect release];
  _mostLikelySuspect = newMostLikelySuspect;
}

/**
 * (no documentation provided)
 */
- (NSArray *) suspects
{
  return _suspects;
}

/**
 * (no documentation provided)
 */
- (void) setSuspects: (NSArray *) newSuspects
{
  [newSuspects retain];
  [_suspects release];
  _suspects = newSuspects;
}

- (void) dealloc
{
  [self setRooms: nil];
  [self setMostLikelyWeapon: nil];
  [self setMostLikelyRoom: nil];
  [self setWeapons: nil];
  [self setMostLikelyTriple: nil];
  [self setMostLikelySuspect: nil];
  [self setSuspects: nil];
  [super dealloc];
}

//documentation inherited.
+ (id<EnunciateXML>) readFromXML: (NSData *) xml
{
  CLUE_SOLVER_RESTNS0ProbabilityReport *_cLUE_SOLVER_RESTNS0ProbabilityReport;
  xmlTextReaderPtr reader = xmlReaderForMemory([xml bytes], [xml length], NULL, NULL, 0);
  if (reader == NULL) {
    [NSException raise: @"XMLReadError"
                 format: @"Error instantiating an XML reader."];
    return nil;
  }

  _cLUE_SOLVER_RESTNS0ProbabilityReport = (CLUE_SOLVER_RESTNS0ProbabilityReport *) [CLUE_SOLVER_RESTNS0ProbabilityReport readXMLElement: reader];
  xmlFreeTextReader(reader); //free the reader
  return _cLUE_SOLVER_RESTNS0ProbabilityReport;
}

//documentation inherited.
- (NSData *) writeToXML
{
  xmlBufferPtr buf;
  xmlTextWriterPtr writer;
  int rc;
  NSData *data;

  buf = xmlBufferCreate();
  if (buf == NULL) {
    [NSException raise: @"XMLWriteError"
                 format: @"Error creating an XML buffer."];
    return nil;
  }

  writer = xmlNewTextWriterMemory(buf, 0);
  if (writer == NULL) {
    xmlBufferFree(buf);
    [NSException raise: @"XMLWriteError"
                 format: @"Error creating an XML writer."];
    return nil;
  }

  rc = xmlTextWriterStartDocument(writer, NULL, "utf-8", NULL);
  if (rc < 0) {
    xmlFreeTextWriter(writer);
    xmlBufferFree(buf);
    [NSException raise: @"XMLWriteError"
                 format: @"Error writing XML start document."];
    return nil;
  }

  NS_DURING
  {
    [self writeXMLElement: writer];
  }
  NS_HANDLER
  {
    xmlFreeTextWriter(writer);
    xmlBufferFree(buf);
    [localException raise];
  }
  NS_ENDHANDLER

  rc = xmlTextWriterEndDocument(writer);
  if (rc < 0) {
    xmlFreeTextWriter(writer);
    xmlBufferFree(buf);
    [NSException raise: @"XMLWriteError"
                 format: @"Error writing XML end document."];
    return nil;
  }

  xmlFreeTextWriter(writer);
  data = [NSData dataWithBytes: buf->content length: buf->use];
  xmlBufferFree(buf);
  return data;
}
@end /* implementation CLUE_SOLVER_RESTNS0ProbabilityReport */

/**
 * Internal, private interface for JAXB reading and writing.
 */
@interface CLUE_SOLVER_RESTNS0ProbabilityReport (JAXB) <JAXBReading, JAXBWriting, JAXBType, JAXBElement>

@end /*interface CLUE_SOLVER_RESTNS0ProbabilityReport (JAXB)*/

/**
 * Internal, private implementation for JAXB reading and writing.
 */
@implementation CLUE_SOLVER_RESTNS0ProbabilityReport (JAXB)

/**
 * Read an instance of CLUE_SOLVER_RESTNS0ProbabilityReport from an XML reader.
 *
 * @param reader The reader.
 * @return An instance of CLUE_SOLVER_RESTNS0ProbabilityReport defined by the XML reader.
 */
+ (id<JAXBType>) readXMLType: (xmlTextReaderPtr) reader
{
  CLUE_SOLVER_RESTNS0ProbabilityReport *_cLUE_SOLVER_RESTNS0ProbabilityReport = [[CLUE_SOLVER_RESTNS0ProbabilityReport alloc] init];
  NS_DURING
  {
    [_cLUE_SOLVER_RESTNS0ProbabilityReport initWithReader: reader];
  }
  NS_HANDLER
  {
    _cLUE_SOLVER_RESTNS0ProbabilityReport = nil;
    [localException raise];
  }
  NS_ENDHANDLER

  [_cLUE_SOLVER_RESTNS0ProbabilityReport autorelease];
  return _cLUE_SOLVER_RESTNS0ProbabilityReport;
}

/**
 * Initialize this instance of CLUE_SOLVER_RESTNS0ProbabilityReport according to
 * the XML being read from the reader.
 *
 * @param reader The reader.
 */
- (id) initWithReader: (xmlTextReaderPtr) reader
{
  return [super initWithReader: reader];
}

/**
 * Write the XML for this instance of CLUE_SOLVER_RESTNS0ProbabilityReport to the writer.
 * Note that since we're only writing the XML type,
 * No start/end element will be written.
 *
 * @param reader The reader.
 */
- (void) writeXMLType: (xmlTextWriterPtr) writer
{
  [super writeXMLType:writer];
}

/**
 * Reads a CLUE_SOLVER_RESTNS0ProbabilityReport from an XML reader. The element to be read is
 * "probabilityReport".
 *
 * @param reader The XML reader.
 * @return The CLUE_SOLVER_RESTNS0ProbabilityReport.
 */
+ (id<JAXBElement>) readXMLElement: (xmlTextReaderPtr) reader {
  int status;
  CLUE_SOLVER_RESTNS0ProbabilityReport *_probabilityReport = nil;

  if (xmlTextReaderNodeType(reader) != XML_READER_TYPE_ELEMENT) {
    status = xmlTextReaderAdvanceToNextStartOrEndElement(reader);
    if (status < 1) {
      [NSException raise: @"XMLReadError"
                   format: @"Error advancing the reader to start element probabilityReport."];
    }
  }

  if (xmlStrcmp(BAD_CAST "probabilityReport", xmlTextReaderConstLocalName(reader)) == 0
      && xmlTextReaderConstNamespaceUri(reader) == NULL) {
#if DEBUG_ENUNCIATE > 1
    NSLog(@"Attempting to read root element {}probabilityReport.");
#endif
    _probabilityReport = (CLUE_SOLVER_RESTNS0ProbabilityReport *)[CLUE_SOLVER_RESTNS0ProbabilityReport readXMLType: reader];
#if DEBUG_ENUNCIATE > 1
    NSLog(@"Successfully read root element {}probabilityReport.");
#endif
  }
  else {
    if (xmlTextReaderConstNamespaceUri(reader) == NULL) {
      [NSException raise: @"XMLReadError"
                   format: @"Unable to read CLUE_SOLVER_RESTNS0ProbabilityReport. Expected element probabilityReport. Current element: {}%s", xmlTextReaderConstLocalName(reader)];
    }
    else {
      [NSException raise: @"XMLReadError"
                   format: @"Unable to read CLUE_SOLVER_RESTNS0ProbabilityReport. Expected element probabilityReport. Current element: {%s}%s\n", xmlTextReaderConstNamespaceUri(reader), xmlTextReaderConstLocalName(reader)];
    }
  }

  return _probabilityReport;
}

/**
 * Writes this CLUE_SOLVER_RESTNS0ProbabilityReport to XML under element name "probabilityReport".
 * The namespace declarations for the element will be written.
 *
 * @param writer The XML writer.
 * @param _probabilityReport The ProbabilityReport to write.
 * @return 1 if successful, 0 otherwise.
 */
- (void) writeXMLElement: (xmlTextWriterPtr) writer
{
  [self writeXMLElement: writer writeNamespaces: YES];
}

/**
 * Writes this CLUE_SOLVER_RESTNS0ProbabilityReport to an XML writer.
 *
 * @param writer The writer.
 * @param writeNs Whether to write the namespaces for this element to the xml writer.
 */
- (void) writeXMLElement: (xmlTextWriterPtr) writer writeNamespaces: (BOOL) writeNs
{
  int rc = xmlTextWriterStartElementNS(writer, NULL, BAD_CAST "probabilityReport", NULL);
  if (rc < 0) {
    [NSException raise: @"XMLWriteError"
                 format: @"Error writing start element {}probabilityReport. XML writer status: %i\n", rc];
  }

#if DEBUG_ENUNCIATE > 1
  NSLog(@"writing type {}probabilityReport for root element {}probabilityReport...");
#endif
  [self writeXMLType: writer];
#if DEBUG_ENUNCIATE > 1
  NSLog(@"successfully wrote type {}probabilityReport for root element {}probabilityReport...");
#endif
  rc = xmlTextWriterEndElement(writer);
  if (rc < 0) {
    [NSException raise: @"XMLWriteError"
                 format: @"Error writing end element {}probabilityReport. XML writer status: %i\n", rc];
  }
}

//documentation inherited.
- (BOOL) readJAXBAttribute: (xmlTextReaderPtr) reader
{
  void *_child_accessor;

  if ([super readJAXBAttribute: reader]) {
    return YES;
  }

  return NO;
}

//documentation inherited.
- (BOOL) readJAXBValue: (xmlTextReaderPtr) reader
{
  return [super readJAXBValue: reader];
}

//documentation inherited.
- (BOOL) readJAXBChildElement: (xmlTextReaderPtr) reader
{
  id __child;
  void *_child_accessor;
  int status, depth;

  if ([super readJAXBChildElement: reader]) {
    return YES;
  }
  if (xmlTextReaderNodeType(reader) == XML_READER_TYPE_ELEMENT
    && xmlStrcmp(BAD_CAST "rooms", xmlTextReaderConstLocalName(reader)) == 0
    && xmlTextReaderConstNamespaceUri(reader) == NULL) {

    if (xmlTextReaderIsEmptyElement(reader) == 0) {
#if DEBUG_ENUNCIATE > 1
      NSLog(@"Unwrapping wrapper element {}rooms...");
#endif
      //start wrapper element "{}rooms"
      depth = xmlTextReaderDepth(reader);
      status = xmlTextReaderAdvanceToNextStartOrEndElement(reader);
      while (xmlTextReaderDepth(reader) > depth) {
        if (status < 1) {
          //panic: XML read error.
          [NSException raise: @"XMLReadError"
                       format: @"Failure to advance to next wrapped child element."];
        }
  if (xmlTextReaderNodeType(reader) == XML_READER_TYPE_ELEMENT
    && xmlStrcmp(BAD_CAST "roomProbability", xmlTextReaderConstLocalName(reader)) == 0
    && xmlTextReaderConstNamespaceUri(reader) == NULL) {

#if DEBUG_ENUNCIATE > 1
    NSLog(@"Attempting to read choice {}roomProbability of type {}probability.");
#endif

    __child = [CLUE_SOLVER_RESTNS0Probability readXMLType: reader];
#if DEBUG_ENUNCIATE > 1
    NSLog(@"successfully read choice {}roomProbability of type {}probability.");
#endif

    if ([self rooms]) {
      [self setRooms: [[self rooms] arrayByAddingObject: __child]];
    }
    else {
      [self setRooms: [NSArray arrayWithObject: __child]];
    }
    continue; //continue "while in wrapper element" loop
  } //end "if choice"

        status = xmlTextReaderAdvanceToNextStartOrEndElement(reader);
#if DEBUG_ENUNCIATE > 1
        NSLog(@"successfully unwrapped wrapper element {}rooms...");
#endif
      } // end "while in wrapper element" loop

      if (status < 1) {
        //panic: XML read error.
        [NSException raise: @"XMLReadError"
                     format: @"Failure to advance to end wrapper element."];
      }
      else {
        //end wrapper element "{}rooms"
        status = xmlTextReaderAdvanceToNextStartOrEndElement(reader);
      }
    } //end "if empty element" clause
    else {
      __child = [NSArray array];
      [self setRooms: (NSArray*) __child];
    }

    return YES;
  } // end "if wrapper element" clause
  if (xmlTextReaderNodeType(reader) == XML_READER_TYPE_ELEMENT
    && xmlStrcmp(BAD_CAST "mostLikelyWeapon", xmlTextReaderConstLocalName(reader)) == 0
    && xmlTextReaderConstNamespaceUri(reader) == NULL) {

#if DEBUG_ENUNCIATE > 1
    NSLog(@"Attempting to read choice {}mostLikelyWeapon of type {}probability.");
#endif
    __child = [CLUE_SOLVER_RESTNS0Probability readXMLType: reader];
#if DEBUG_ENUNCIATE > 1
    NSLog(@"successfully read choice {}mostLikelyWeapon of type {}probability.");
#endif

    [self setMostLikelyWeapon: __child];
    return YES;
  } //end "if choice"

  if (xmlTextReaderNodeType(reader) == XML_READER_TYPE_ELEMENT
    && xmlStrcmp(BAD_CAST "mostLikelyRoom", xmlTextReaderConstLocalName(reader)) == 0
    && xmlTextReaderConstNamespaceUri(reader) == NULL) {

#if DEBUG_ENUNCIATE > 1
    NSLog(@"Attempting to read choice {}mostLikelyRoom of type {}probability.");
#endif
    __child = [CLUE_SOLVER_RESTNS0Probability readXMLType: reader];
#if DEBUG_ENUNCIATE > 1
    NSLog(@"successfully read choice {}mostLikelyRoom of type {}probability.");
#endif

    [self setMostLikelyRoom: __child];
    return YES;
  } //end "if choice"

  if (xmlTextReaderNodeType(reader) == XML_READER_TYPE_ELEMENT
    && xmlStrcmp(BAD_CAST "weapons", xmlTextReaderConstLocalName(reader)) == 0
    && xmlTextReaderConstNamespaceUri(reader) == NULL) {

    if (xmlTextReaderIsEmptyElement(reader) == 0) {
#if DEBUG_ENUNCIATE > 1
      NSLog(@"Unwrapping wrapper element {}weapons...");
#endif
      //start wrapper element "{}weapons"
      depth = xmlTextReaderDepth(reader);
      status = xmlTextReaderAdvanceToNextStartOrEndElement(reader);
      while (xmlTextReaderDepth(reader) > depth) {
        if (status < 1) {
          //panic: XML read error.
          [NSException raise: @"XMLReadError"
                       format: @"Failure to advance to next wrapped child element."];
        }
  if (xmlTextReaderNodeType(reader) == XML_READER_TYPE_ELEMENT
    && xmlStrcmp(BAD_CAST "weaponProbability", xmlTextReaderConstLocalName(reader)) == 0
    && xmlTextReaderConstNamespaceUri(reader) == NULL) {

#if DEBUG_ENUNCIATE > 1
    NSLog(@"Attempting to read choice {}weaponProbability of type {}probability.");
#endif

    __child = [CLUE_SOLVER_RESTNS0Probability readXMLType: reader];
#if DEBUG_ENUNCIATE > 1
    NSLog(@"successfully read choice {}weaponProbability of type {}probability.");
#endif

    if ([self weapons]) {
      [self setWeapons: [[self weapons] arrayByAddingObject: __child]];
    }
    else {
      [self setWeapons: [NSArray arrayWithObject: __child]];
    }
    continue; //continue "while in wrapper element" loop
  } //end "if choice"

        status = xmlTextReaderAdvanceToNextStartOrEndElement(reader);
#if DEBUG_ENUNCIATE > 1
        NSLog(@"successfully unwrapped wrapper element {}weapons...");
#endif
      } // end "while in wrapper element" loop

      if (status < 1) {
        //panic: XML read error.
        [NSException raise: @"XMLReadError"
                     format: @"Failure to advance to end wrapper element."];
      }
      else {
        //end wrapper element "{}weapons"
        status = xmlTextReaderAdvanceToNextStartOrEndElement(reader);
      }
    } //end "if empty element" clause
    else {
      __child = [NSArray array];
      [self setWeapons: (NSArray*) __child];
    }

    return YES;
  } // end "if wrapper element" clause
  if (xmlTextReaderNodeType(reader) == XML_READER_TYPE_ELEMENT
    && xmlStrcmp(BAD_CAST "mostLikelyTriple", xmlTextReaderConstLocalName(reader)) == 0
    && xmlTextReaderConstNamespaceUri(reader) == NULL) {

#if DEBUG_ENUNCIATE > 1
    NSLog(@"Attempting to read choice {}mostLikelyTriple of type {}probability.");
#endif
    __child = [CLUE_SOLVER_RESTNS0Probability readXMLType: reader];
#if DEBUG_ENUNCIATE > 1
    NSLog(@"successfully read choice {}mostLikelyTriple of type {}probability.");
#endif

    [self setMostLikelyTriple: __child];
    return YES;
  } //end "if choice"

  if (xmlTextReaderNodeType(reader) == XML_READER_TYPE_ELEMENT
    && xmlStrcmp(BAD_CAST "mostLikelySuspect", xmlTextReaderConstLocalName(reader)) == 0
    && xmlTextReaderConstNamespaceUri(reader) == NULL) {

#if DEBUG_ENUNCIATE > 1
    NSLog(@"Attempting to read choice {}mostLikelySuspect of type {}probability.");
#endif
    __child = [CLUE_SOLVER_RESTNS0Probability readXMLType: reader];
#if DEBUG_ENUNCIATE > 1
    NSLog(@"successfully read choice {}mostLikelySuspect of type {}probability.");
#endif

    [self setMostLikelySuspect: __child];
    return YES;
  } //end "if choice"

  if (xmlTextReaderNodeType(reader) == XML_READER_TYPE_ELEMENT
    && xmlStrcmp(BAD_CAST "suspects", xmlTextReaderConstLocalName(reader)) == 0
    && xmlTextReaderConstNamespaceUri(reader) == NULL) {

    if (xmlTextReaderIsEmptyElement(reader) == 0) {
#if DEBUG_ENUNCIATE > 1
      NSLog(@"Unwrapping wrapper element {}suspects...");
#endif
      //start wrapper element "{}suspects"
      depth = xmlTextReaderDepth(reader);
      status = xmlTextReaderAdvanceToNextStartOrEndElement(reader);
      while (xmlTextReaderDepth(reader) > depth) {
        if (status < 1) {
          //panic: XML read error.
          [NSException raise: @"XMLReadError"
                       format: @"Failure to advance to next wrapped child element."];
        }
  if (xmlTextReaderNodeType(reader) == XML_READER_TYPE_ELEMENT
    && xmlStrcmp(BAD_CAST "suspectProbability", xmlTextReaderConstLocalName(reader)) == 0
    && xmlTextReaderConstNamespaceUri(reader) == NULL) {

#if DEBUG_ENUNCIATE > 1
    NSLog(@"Attempting to read choice {}suspectProbability of type {}probability.");
#endif

    __child = [CLUE_SOLVER_RESTNS0Probability readXMLType: reader];
#if DEBUG_ENUNCIATE > 1
    NSLog(@"successfully read choice {}suspectProbability of type {}probability.");
#endif

    if ([self suspects]) {
      [self setSuspects: [[self suspects] arrayByAddingObject: __child]];
    }
    else {
      [self setSuspects: [NSArray arrayWithObject: __child]];
    }
    continue; //continue "while in wrapper element" loop
  } //end "if choice"

        status = xmlTextReaderAdvanceToNextStartOrEndElement(reader);
#if DEBUG_ENUNCIATE > 1
        NSLog(@"successfully unwrapped wrapper element {}suspects...");
#endif
      } // end "while in wrapper element" loop

      if (status < 1) {
        //panic: XML read error.
        [NSException raise: @"XMLReadError"
                     format: @"Failure to advance to end wrapper element."];
      }
      else {
        //end wrapper element "{}suspects"
        status = xmlTextReaderAdvanceToNextStartOrEndElement(reader);
      }
    } //end "if empty element" clause
    else {
      __child = [NSArray array];
      [self setSuspects: (NSArray*) __child];
    }

    return YES;
  } // end "if wrapper element" clause

  return NO;
}

//documentation inherited.
- (int) readUnknownJAXBChildElement: (xmlTextReaderPtr) reader
{
  return [super readUnknownJAXBChildElement: reader];
}

//documentation inherited.
- (void) readUnknownJAXBAttribute: (xmlTextReaderPtr) reader
{
  [super readUnknownJAXBAttribute: reader];
}

//documentation inherited.
- (void) writeJAXBAttributes: (xmlTextWriterPtr) writer
{
  int status;

  [super writeJAXBAttributes: writer];

}

//documentation inherited.
- (void) writeJAXBValue: (xmlTextWriterPtr) writer
{
  [super writeJAXBValue: writer];
}

/**
 * Method for writing the child elements.
 *
 * @param writer The writer.
 */
- (void) writeJAXBChildElements: (xmlTextWriterPtr) writer
{
  int status;
  id __item;
  NSEnumerator *__enumerator;

  [super writeJAXBChildElements: writer];

  if ([self rooms]) {
    status = xmlTextWriterStartElementNS(writer, NULL, BAD_CAST "rooms", NULL);
    if (status < 0) {
      [NSException raise: @"XMLWriteError"
                   format: @"Error writing start wrapper element {}rooms."];
    }
    __enumerator = [[self rooms] objectEnumerator];

    while ( (__item = [__enumerator nextObject]) ) {
      status = xmlTextWriterStartElementNS(writer, NULL, BAD_CAST "roomProbability", NULL);
      if (status < 0) {
        [NSException raise: @"XMLWriteError"
                     format: @"Error writing start child element {}roomProbability."];
      }

#if DEBUG_ENUNCIATE > 1
      NSLog(@"writing element {}roomProbability...");
#endif
      [__item writeXMLType: writer];
#if DEBUG_ENUNCIATE > 1
      NSLog(@"successfully wrote element {}roomProbability...");
#endif

      status = xmlTextWriterEndElement(writer);
      if (status < 0) {
        [NSException raise: @"XMLWriteError"
                     format: @"Error writing end child element {}roomProbability."];
      }
    } //end item iterator.

    status = xmlTextWriterEndElement(writer);
    if (status < 0) {
      [NSException raise: @"XMLWriteError"
                   format: @"Error writing end wrapper element {}rooms."];
    }
  }
  if ([self mostLikelyWeapon]) {
    status = xmlTextWriterStartElementNS(writer, NULL, BAD_CAST "mostLikelyWeapon", NULL);
    if (status < 0) {
      [NSException raise: @"XMLWriteError"
                   format: @"Error writing start child element {}mostLikelyWeapon."];
    }

#if DEBUG_ENUNCIATE > 1
    NSLog(@"writing element {}mostLikelyWeapon...");
#endif
    [[self mostLikelyWeapon] writeXMLType: writer];
#if DEBUG_ENUNCIATE > 1
    NSLog(@"successfully wrote element {}mostLikelyWeapon...");
#endif

    status = xmlTextWriterEndElement(writer);
    if (status < 0) {
      [NSException raise: @"XMLWriteError"
                   format: @"Error writing end child element {}mostLikelyWeapon."];
    }
  }
  if ([self mostLikelyRoom]) {
    status = xmlTextWriterStartElementNS(writer, NULL, BAD_CAST "mostLikelyRoom", NULL);
    if (status < 0) {
      [NSException raise: @"XMLWriteError"
                   format: @"Error writing start child element {}mostLikelyRoom."];
    }

#if DEBUG_ENUNCIATE > 1
    NSLog(@"writing element {}mostLikelyRoom...");
#endif
    [[self mostLikelyRoom] writeXMLType: writer];
#if DEBUG_ENUNCIATE > 1
    NSLog(@"successfully wrote element {}mostLikelyRoom...");
#endif

    status = xmlTextWriterEndElement(writer);
    if (status < 0) {
      [NSException raise: @"XMLWriteError"
                   format: @"Error writing end child element {}mostLikelyRoom."];
    }
  }
  if ([self weapons]) {
    status = xmlTextWriterStartElementNS(writer, NULL, BAD_CAST "weapons", NULL);
    if (status < 0) {
      [NSException raise: @"XMLWriteError"
                   format: @"Error writing start wrapper element {}weapons."];
    }
    __enumerator = [[self weapons] objectEnumerator];

    while ( (__item = [__enumerator nextObject]) ) {
      status = xmlTextWriterStartElementNS(writer, NULL, BAD_CAST "weaponProbability", NULL);
      if (status < 0) {
        [NSException raise: @"XMLWriteError"
                     format: @"Error writing start child element {}weaponProbability."];
      }

#if DEBUG_ENUNCIATE > 1
      NSLog(@"writing element {}weaponProbability...");
#endif
      [__item writeXMLType: writer];
#if DEBUG_ENUNCIATE > 1
      NSLog(@"successfully wrote element {}weaponProbability...");
#endif

      status = xmlTextWriterEndElement(writer);
      if (status < 0) {
        [NSException raise: @"XMLWriteError"
                     format: @"Error writing end child element {}weaponProbability."];
      }
    } //end item iterator.

    status = xmlTextWriterEndElement(writer);
    if (status < 0) {
      [NSException raise: @"XMLWriteError"
                   format: @"Error writing end wrapper element {}weapons."];
    }
  }
  if ([self mostLikelyTriple]) {
    status = xmlTextWriterStartElementNS(writer, NULL, BAD_CAST "mostLikelyTriple", NULL);
    if (status < 0) {
      [NSException raise: @"XMLWriteError"
                   format: @"Error writing start child element {}mostLikelyTriple."];
    }

#if DEBUG_ENUNCIATE > 1
    NSLog(@"writing element {}mostLikelyTriple...");
#endif
    [[self mostLikelyTriple] writeXMLType: writer];
#if DEBUG_ENUNCIATE > 1
    NSLog(@"successfully wrote element {}mostLikelyTriple...");
#endif

    status = xmlTextWriterEndElement(writer);
    if (status < 0) {
      [NSException raise: @"XMLWriteError"
                   format: @"Error writing end child element {}mostLikelyTriple."];
    }
  }
  if ([self mostLikelySuspect]) {
    status = xmlTextWriterStartElementNS(writer, NULL, BAD_CAST "mostLikelySuspect", NULL);
    if (status < 0) {
      [NSException raise: @"XMLWriteError"
                   format: @"Error writing start child element {}mostLikelySuspect."];
    }

#if DEBUG_ENUNCIATE > 1
    NSLog(@"writing element {}mostLikelySuspect...");
#endif
    [[self mostLikelySuspect] writeXMLType: writer];
#if DEBUG_ENUNCIATE > 1
    NSLog(@"successfully wrote element {}mostLikelySuspect...");
#endif

    status = xmlTextWriterEndElement(writer);
    if (status < 0) {
      [NSException raise: @"XMLWriteError"
                   format: @"Error writing end child element {}mostLikelySuspect."];
    }
  }
  if ([self suspects]) {
    status = xmlTextWriterStartElementNS(writer, NULL, BAD_CAST "suspects", NULL);
    if (status < 0) {
      [NSException raise: @"XMLWriteError"
                   format: @"Error writing start wrapper element {}suspects."];
    }
    __enumerator = [[self suspects] objectEnumerator];

    while ( (__item = [__enumerator nextObject]) ) {
      status = xmlTextWriterStartElementNS(writer, NULL, BAD_CAST "suspectProbability", NULL);
      if (status < 0) {
        [NSException raise: @"XMLWriteError"
                     format: @"Error writing start child element {}suspectProbability."];
      }

#if DEBUG_ENUNCIATE > 1
      NSLog(@"writing element {}suspectProbability...");
#endif
      [__item writeXMLType: writer];
#if DEBUG_ENUNCIATE > 1
      NSLog(@"successfully wrote element {}suspectProbability...");
#endif

      status = xmlTextWriterEndElement(writer);
      if (status < 0) {
        [NSException raise: @"XMLWriteError"
                     format: @"Error writing end child element {}suspectProbability."];
      }
    } //end item iterator.

    status = xmlTextWriterEndElement(writer);
    if (status < 0) {
      [NSException raise: @"XMLWriteError"
                   format: @"Error writing end wrapper element {}suspects."];
    }
  }
}
@end /* implementation CLUE_SOLVER_RESTNS0ProbabilityReport (JAXB) */

#endif /* DEF_CLUE_SOLVER_RESTNS0ProbabilityReport_M */
#ifndef DEF_CLUE_SOLVER_RESTNS0Card_M
#define DEF_CLUE_SOLVER_RESTNS0Card_M

/**
 * (no documentation provided)
 */
@implementation CLUE_SOLVER_RESTNS0Card

/**
 * (no documentation provided)
 */
- (NSString *) name
{
  return _name;
}

/**
 * (no documentation provided)
 */
- (void) setName: (NSString *) newName
{
  [newName retain];
  [_name release];
  _name = newName;
}

/**
 * (no documentation provided)
 */
- (NSString *) type
{
  return _type;
}

/**
 * (no documentation provided)
 */
- (void) setType: (NSString *) newType
{
  [newType retain];
  [_type release];
  _type = newType;
}

- (void) dealloc
{
  [self setName: nil];
  [self setType: nil];
  [super dealloc];
}

//documentation inherited.
+ (id<EnunciateXML>) readFromXML: (NSData *) xml
{
  CLUE_SOLVER_RESTNS0Card *_cLUE_SOLVER_RESTNS0Card;
  xmlTextReaderPtr reader = xmlReaderForMemory([xml bytes], [xml length], NULL, NULL, 0);
  if (reader == NULL) {
    [NSException raise: @"XMLReadError"
                 format: @"Error instantiating an XML reader."];
    return nil;
  }

  _cLUE_SOLVER_RESTNS0Card = (CLUE_SOLVER_RESTNS0Card *) [CLUE_SOLVER_RESTNS0Card readXMLElement: reader];
  xmlFreeTextReader(reader); //free the reader
  return _cLUE_SOLVER_RESTNS0Card;
}

//documentation inherited.
- (NSData *) writeToXML
{
  xmlBufferPtr buf;
  xmlTextWriterPtr writer;
  int rc;
  NSData *data;

  buf = xmlBufferCreate();
  if (buf == NULL) {
    [NSException raise: @"XMLWriteError"
                 format: @"Error creating an XML buffer."];
    return nil;
  }

  writer = xmlNewTextWriterMemory(buf, 0);
  if (writer == NULL) {
    xmlBufferFree(buf);
    [NSException raise: @"XMLWriteError"
                 format: @"Error creating an XML writer."];
    return nil;
  }

  rc = xmlTextWriterStartDocument(writer, NULL, "utf-8", NULL);
  if (rc < 0) {
    xmlFreeTextWriter(writer);
    xmlBufferFree(buf);
    [NSException raise: @"XMLWriteError"
                 format: @"Error writing XML start document."];
    return nil;
  }

  NS_DURING
  {
    [self writeXMLElement: writer];
  }
  NS_HANDLER
  {
    xmlFreeTextWriter(writer);
    xmlBufferFree(buf);
    [localException raise];
  }
  NS_ENDHANDLER

  rc = xmlTextWriterEndDocument(writer);
  if (rc < 0) {
    xmlFreeTextWriter(writer);
    xmlBufferFree(buf);
    [NSException raise: @"XMLWriteError"
                 format: @"Error writing XML end document."];
    return nil;
  }

  xmlFreeTextWriter(writer);
  data = [NSData dataWithBytes: buf->content length: buf->use];
  xmlBufferFree(buf);
  return data;
}
@end /* implementation CLUE_SOLVER_RESTNS0Card */

/**
 * Internal, private interface for JAXB reading and writing.
 */
@interface CLUE_SOLVER_RESTNS0Card (JAXB) <JAXBReading, JAXBWriting, JAXBType, JAXBElement>

@end /*interface CLUE_SOLVER_RESTNS0Card (JAXB)*/

/**
 * Internal, private implementation for JAXB reading and writing.
 */
@implementation CLUE_SOLVER_RESTNS0Card (JAXB)

/**
 * Read an instance of CLUE_SOLVER_RESTNS0Card from an XML reader.
 *
 * @param reader The reader.
 * @return An instance of CLUE_SOLVER_RESTNS0Card defined by the XML reader.
 */
+ (id<JAXBType>) readXMLType: (xmlTextReaderPtr) reader
{
  CLUE_SOLVER_RESTNS0Card *_cLUE_SOLVER_RESTNS0Card = [[CLUE_SOLVER_RESTNS0Card alloc] init];
  NS_DURING
  {
    [_cLUE_SOLVER_RESTNS0Card initWithReader: reader];
  }
  NS_HANDLER
  {
    _cLUE_SOLVER_RESTNS0Card = nil;
    [localException raise];
  }
  NS_ENDHANDLER

  [_cLUE_SOLVER_RESTNS0Card autorelease];
  return _cLUE_SOLVER_RESTNS0Card;
}

/**
 * Initialize this instance of CLUE_SOLVER_RESTNS0Card according to
 * the XML being read from the reader.
 *
 * @param reader The reader.
 */
- (id) initWithReader: (xmlTextReaderPtr) reader
{
  return [super initWithReader: reader];
}

/**
 * Write the XML for this instance of CLUE_SOLVER_RESTNS0Card to the writer.
 * Note that since we're only writing the XML type,
 * No start/end element will be written.
 *
 * @param reader The reader.
 */
- (void) writeXMLType: (xmlTextWriterPtr) writer
{
  [super writeXMLType:writer];
}

/**
 * Reads a CLUE_SOLVER_RESTNS0Card from an XML reader. The element to be read is
 * "card".
 *
 * @param reader The XML reader.
 * @return The CLUE_SOLVER_RESTNS0Card.
 */
+ (id<JAXBElement>) readXMLElement: (xmlTextReaderPtr) reader {
  int status;
  CLUE_SOLVER_RESTNS0Card *_card = nil;

  if (xmlTextReaderNodeType(reader) != XML_READER_TYPE_ELEMENT) {
    status = xmlTextReaderAdvanceToNextStartOrEndElement(reader);
    if (status < 1) {
      [NSException raise: @"XMLReadError"
                   format: @"Error advancing the reader to start element card."];
    }
  }

  if (xmlStrcmp(BAD_CAST "card", xmlTextReaderConstLocalName(reader)) == 0
      && xmlTextReaderConstNamespaceUri(reader) == NULL) {
#if DEBUG_ENUNCIATE > 1
    NSLog(@"Attempting to read root element {}card.");
#endif
    _card = (CLUE_SOLVER_RESTNS0Card *)[CLUE_SOLVER_RESTNS0Card readXMLType: reader];
#if DEBUG_ENUNCIATE > 1
    NSLog(@"Successfully read root element {}card.");
#endif
  }
  else {
    if (xmlTextReaderConstNamespaceUri(reader) == NULL) {
      [NSException raise: @"XMLReadError"
                   format: @"Unable to read CLUE_SOLVER_RESTNS0Card. Expected element card. Current element: {}%s", xmlTextReaderConstLocalName(reader)];
    }
    else {
      [NSException raise: @"XMLReadError"
                   format: @"Unable to read CLUE_SOLVER_RESTNS0Card. Expected element card. Current element: {%s}%s\n", xmlTextReaderConstNamespaceUri(reader), xmlTextReaderConstLocalName(reader)];
    }
  }

  return _card;
}

/**
 * Writes this CLUE_SOLVER_RESTNS0Card to XML under element name "card".
 * The namespace declarations for the element will be written.
 *
 * @param writer The XML writer.
 * @param _card The Card to write.
 * @return 1 if successful, 0 otherwise.
 */
- (void) writeXMLElement: (xmlTextWriterPtr) writer
{
  [self writeXMLElement: writer writeNamespaces: YES];
}

/**
 * Writes this CLUE_SOLVER_RESTNS0Card to an XML writer.
 *
 * @param writer The writer.
 * @param writeNs Whether to write the namespaces for this element to the xml writer.
 */
- (void) writeXMLElement: (xmlTextWriterPtr) writer writeNamespaces: (BOOL) writeNs
{
  int rc = xmlTextWriterStartElementNS(writer, NULL, BAD_CAST "card", NULL);
  if (rc < 0) {
    [NSException raise: @"XMLWriteError"
                 format: @"Error writing start element {}card. XML writer status: %i\n", rc];
  }

#if DEBUG_ENUNCIATE > 1
  NSLog(@"writing type {}card for root element {}card...");
#endif
  [self writeXMLType: writer];
#if DEBUG_ENUNCIATE > 1
  NSLog(@"successfully wrote type {}card for root element {}card...");
#endif
  rc = xmlTextWriterEndElement(writer);
  if (rc < 0) {
    [NSException raise: @"XMLWriteError"
                 format: @"Error writing end element {}card. XML writer status: %i\n", rc];
  }
}

//documentation inherited.
- (BOOL) readJAXBAttribute: (xmlTextReaderPtr) reader
{
  void *_child_accessor;

  if ([super readJAXBAttribute: reader]) {
    return YES;
  }

  if ((xmlStrcmp(BAD_CAST "name", xmlTextReaderConstLocalName(reader)) == 0) && (xmlTextReaderConstNamespaceUri(reader) == NULL)) {
#if DEBUG_ENUNCIATE > 1
    NSLog(@"Attempting to read attribute {}name...");
#endif
    [self setName: (NSString*) [NSString readXMLType: reader]];
#if DEBUG_ENUNCIATE > 1
    NSLog(@"successfully read attribute {}name...");
#endif
    return YES;
  }

  if ((xmlStrcmp(BAD_CAST "type", xmlTextReaderConstLocalName(reader)) == 0) && (xmlTextReaderConstNamespaceUri(reader) == NULL)) {
#if DEBUG_ENUNCIATE > 1
    NSLog(@"Attempting to read attribute {}type...");
#endif
    [self setType: (NSString*) [NSString readXMLType: reader]];
#if DEBUG_ENUNCIATE > 1
    NSLog(@"successfully read attribute {}type...");
#endif
    return YES;
  }

  return NO;
}

//documentation inherited.
- (BOOL) readJAXBValue: (xmlTextReaderPtr) reader
{
  return [super readJAXBValue: reader];
}

//documentation inherited.
- (BOOL) readJAXBChildElement: (xmlTextReaderPtr) reader
{
  id __child;
  void *_child_accessor;
  int status, depth;

  if ([super readJAXBChildElement: reader]) {
    return YES;
  }

  return NO;
}

//documentation inherited.
- (int) readUnknownJAXBChildElement: (xmlTextReaderPtr) reader
{
  return [super readUnknownJAXBChildElement: reader];
}

//documentation inherited.
- (void) readUnknownJAXBAttribute: (xmlTextReaderPtr) reader
{
  [super readUnknownJAXBAttribute: reader];
}

//documentation inherited.
- (void) writeJAXBAttributes: (xmlTextWriterPtr) writer
{
  int status;

  [super writeJAXBAttributes: writer];

  if ([self name]) {

    status = xmlTextWriterStartAttributeNS(writer, NULL, BAD_CAST "name", NULL);
    if (status < 0) {
      [NSException raise: @"XMLWriteError"
                   format: @"Error writing start attribute {}name."];
    }

#if DEBUG_ENUNCIATE > 1
    NSLog(@"writing attribute {}name...");
#endif
    [[self name] writeXMLType: writer];
#if DEBUG_ENUNCIATE > 1
    NSLog(@"successfully wrote attribute {}name...");
#endif

    status = xmlTextWriterEndAttribute(writer);
    if (status < 0) {
      [NSException raise: @"XMLWriteError"
                   format: @"Error writing end attribute {}name."];
    }
  }
  if ([self type]) {

    status = xmlTextWriterStartAttributeNS(writer, NULL, BAD_CAST "type", NULL);
    if (status < 0) {
      [NSException raise: @"XMLWriteError"
                   format: @"Error writing start attribute {}type."];
    }

#if DEBUG_ENUNCIATE > 1
    NSLog(@"writing attribute {}type...");
#endif
    [[self type] writeXMLType: writer];
#if DEBUG_ENUNCIATE > 1
    NSLog(@"successfully wrote attribute {}type...");
#endif

    status = xmlTextWriterEndAttribute(writer);
    if (status < 0) {
      [NSException raise: @"XMLWriteError"
                   format: @"Error writing end attribute {}type."];
    }
  }
}

//documentation inherited.
- (void) writeJAXBValue: (xmlTextWriterPtr) writer
{
  [super writeJAXBValue: writer];
}

/**
 * Method for writing the child elements.
 *
 * @param writer The writer.
 */
- (void) writeJAXBChildElements: (xmlTextWriterPtr) writer
{
  int status;
  id __item;
  NSEnumerator *__enumerator;

  [super writeJAXBChildElements: writer];

}
@end /* implementation CLUE_SOLVER_RESTNS0Card (JAXB) */

#endif /* DEF_CLUE_SOLVER_RESTNS0Card_M */
#ifndef DEF_CLUE_SOLVER_RESTNS0Weapon_M
#define DEF_CLUE_SOLVER_RESTNS0Weapon_M

/**
 * (no documentation provided)
 */
@implementation CLUE_SOLVER_RESTNS0Weapon

- (void) dealloc
{
  [super dealloc];
}

//documentation inherited.
+ (id<EnunciateXML>) readFromXML: (NSData *) xml
{
  CLUE_SOLVER_RESTNS0Weapon *_cLUE_SOLVER_RESTNS0Weapon;
  xmlTextReaderPtr reader = xmlReaderForMemory([xml bytes], [xml length], NULL, NULL, 0);
  if (reader == NULL) {
    [NSException raise: @"XMLReadError"
                 format: @"Error instantiating an XML reader."];
    return nil;
  }

  _cLUE_SOLVER_RESTNS0Weapon = (CLUE_SOLVER_RESTNS0Weapon *) [CLUE_SOLVER_RESTNS0Weapon readXMLElement: reader];
  xmlFreeTextReader(reader); //free the reader
  return _cLUE_SOLVER_RESTNS0Weapon;
}

//documentation inherited.
- (NSData *) writeToXML
{
  xmlBufferPtr buf;
  xmlTextWriterPtr writer;
  int rc;
  NSData *data;

  buf = xmlBufferCreate();
  if (buf == NULL) {
    [NSException raise: @"XMLWriteError"
                 format: @"Error creating an XML buffer."];
    return nil;
  }

  writer = xmlNewTextWriterMemory(buf, 0);
  if (writer == NULL) {
    xmlBufferFree(buf);
    [NSException raise: @"XMLWriteError"
                 format: @"Error creating an XML writer."];
    return nil;
  }

  rc = xmlTextWriterStartDocument(writer, NULL, "utf-8", NULL);
  if (rc < 0) {
    xmlFreeTextWriter(writer);
    xmlBufferFree(buf);
    [NSException raise: @"XMLWriteError"
                 format: @"Error writing XML start document."];
    return nil;
  }

  NS_DURING
  {
    [self writeXMLElement: writer];
  }
  NS_HANDLER
  {
    xmlFreeTextWriter(writer);
    xmlBufferFree(buf);
    [localException raise];
  }
  NS_ENDHANDLER

  rc = xmlTextWriterEndDocument(writer);
  if (rc < 0) {
    xmlFreeTextWriter(writer);
    xmlBufferFree(buf);
    [NSException raise: @"XMLWriteError"
                 format: @"Error writing XML end document."];
    return nil;
  }

  xmlFreeTextWriter(writer);
  data = [NSData dataWithBytes: buf->content length: buf->use];
  xmlBufferFree(buf);
  return data;
}
@end /* implementation CLUE_SOLVER_RESTNS0Weapon */

/**
 * Internal, private interface for JAXB reading and writing.
 */
@interface CLUE_SOLVER_RESTNS0Weapon (JAXB) <JAXBReading, JAXBWriting, JAXBType, JAXBElement>

@end /*interface CLUE_SOLVER_RESTNS0Weapon (JAXB)*/

/**
 * Internal, private implementation for JAXB reading and writing.
 */
@implementation CLUE_SOLVER_RESTNS0Weapon (JAXB)

/**
 * Read an instance of CLUE_SOLVER_RESTNS0Weapon from an XML reader.
 *
 * @param reader The reader.
 * @return An instance of CLUE_SOLVER_RESTNS0Weapon defined by the XML reader.
 */
+ (id<JAXBType>) readXMLType: (xmlTextReaderPtr) reader
{
  CLUE_SOLVER_RESTNS0Weapon *_cLUE_SOLVER_RESTNS0Weapon = [[CLUE_SOLVER_RESTNS0Weapon alloc] init];
  NS_DURING
  {
    [_cLUE_SOLVER_RESTNS0Weapon initWithReader: reader];
  }
  NS_HANDLER
  {
    _cLUE_SOLVER_RESTNS0Weapon = nil;
    [localException raise];
  }
  NS_ENDHANDLER

  [_cLUE_SOLVER_RESTNS0Weapon autorelease];
  return _cLUE_SOLVER_RESTNS0Weapon;
}

/**
 * Initialize this instance of CLUE_SOLVER_RESTNS0Weapon according to
 * the XML being read from the reader.
 *
 * @param reader The reader.
 */
- (id) initWithReader: (xmlTextReaderPtr) reader
{
  return [super initWithReader: reader];
}

/**
 * Write the XML for this instance of CLUE_SOLVER_RESTNS0Weapon to the writer.
 * Note that since we're only writing the XML type,
 * No start/end element will be written.
 *
 * @param reader The reader.
 */
- (void) writeXMLType: (xmlTextWriterPtr) writer
{
  [super writeXMLType:writer];
}

/**
 * Reads a CLUE_SOLVER_RESTNS0Weapon from an XML reader. The element to be read is
 * "weapon".
 *
 * @param reader The XML reader.
 * @return The CLUE_SOLVER_RESTNS0Weapon.
 */
+ (id<JAXBElement>) readXMLElement: (xmlTextReaderPtr) reader {
  int status;
  CLUE_SOLVER_RESTNS0Weapon *_weapon = nil;

  if (xmlTextReaderNodeType(reader) != XML_READER_TYPE_ELEMENT) {
    status = xmlTextReaderAdvanceToNextStartOrEndElement(reader);
    if (status < 1) {
      [NSException raise: @"XMLReadError"
                   format: @"Error advancing the reader to start element weapon."];
    }
  }

  if (xmlStrcmp(BAD_CAST "weapon", xmlTextReaderConstLocalName(reader)) == 0
      && xmlTextReaderConstNamespaceUri(reader) == NULL) {
#if DEBUG_ENUNCIATE > 1
    NSLog(@"Attempting to read root element {}weapon.");
#endif
    _weapon = (CLUE_SOLVER_RESTNS0Weapon *)[CLUE_SOLVER_RESTNS0Weapon readXMLType: reader];
#if DEBUG_ENUNCIATE > 1
    NSLog(@"Successfully read root element {}weapon.");
#endif
  }
  else {
    if (xmlTextReaderConstNamespaceUri(reader) == NULL) {
      [NSException raise: @"XMLReadError"
                   format: @"Unable to read CLUE_SOLVER_RESTNS0Weapon. Expected element weapon. Current element: {}%s", xmlTextReaderConstLocalName(reader)];
    }
    else {
      [NSException raise: @"XMLReadError"
                   format: @"Unable to read CLUE_SOLVER_RESTNS0Weapon. Expected element weapon. Current element: {%s}%s\n", xmlTextReaderConstNamespaceUri(reader), xmlTextReaderConstLocalName(reader)];
    }
  }

  return _weapon;
}

/**
 * Writes this CLUE_SOLVER_RESTNS0Weapon to XML under element name "weapon".
 * The namespace declarations for the element will be written.
 *
 * @param writer The XML writer.
 * @param _weapon The Weapon to write.
 * @return 1 if successful, 0 otherwise.
 */
- (void) writeXMLElement: (xmlTextWriterPtr) writer
{
  [self writeXMLElement: writer writeNamespaces: YES];
}

/**
 * Writes this CLUE_SOLVER_RESTNS0Weapon to an XML writer.
 *
 * @param writer The writer.
 * @param writeNs Whether to write the namespaces for this element to the xml writer.
 */
- (void) writeXMLElement: (xmlTextWriterPtr) writer writeNamespaces: (BOOL) writeNs
{
  int rc = xmlTextWriterStartElementNS(writer, NULL, BAD_CAST "weapon", NULL);
  if (rc < 0) {
    [NSException raise: @"XMLWriteError"
                 format: @"Error writing start element {}weapon. XML writer status: %i\n", rc];
  }

#if DEBUG_ENUNCIATE > 1
  NSLog(@"writing type {}weapon for root element {}weapon...");
#endif
  [self writeXMLType: writer];
#if DEBUG_ENUNCIATE > 1
  NSLog(@"successfully wrote type {}weapon for root element {}weapon...");
#endif
  rc = xmlTextWriterEndElement(writer);
  if (rc < 0) {
    [NSException raise: @"XMLWriteError"
                 format: @"Error writing end element {}weapon. XML writer status: %i\n", rc];
  }
}

//documentation inherited.
- (BOOL) readJAXBAttribute: (xmlTextReaderPtr) reader
{
  void *_child_accessor;

  if ([super readJAXBAttribute: reader]) {
    return YES;
  }

  return NO;
}

//documentation inherited.
- (BOOL) readJAXBValue: (xmlTextReaderPtr) reader
{
  return [super readJAXBValue: reader];
}

//documentation inherited.
- (BOOL) readJAXBChildElement: (xmlTextReaderPtr) reader
{
  id __child;
  void *_child_accessor;
  int status, depth;

  if ([super readJAXBChildElement: reader]) {
    return YES;
  }

  return NO;
}

//documentation inherited.
- (int) readUnknownJAXBChildElement: (xmlTextReaderPtr) reader
{
  return [super readUnknownJAXBChildElement: reader];
}

//documentation inherited.
- (void) readUnknownJAXBAttribute: (xmlTextReaderPtr) reader
{
  [super readUnknownJAXBAttribute: reader];
}

//documentation inherited.
- (void) writeJAXBAttributes: (xmlTextWriterPtr) writer
{
  int status;

  [super writeJAXBAttributes: writer];

}

//documentation inherited.
- (void) writeJAXBValue: (xmlTextWriterPtr) writer
{
  [super writeJAXBValue: writer];
}

/**
 * Method for writing the child elements.
 *
 * @param writer The writer.
 */
- (void) writeJAXBChildElements: (xmlTextWriterPtr) writer
{
  int status;
  id __item;
  NSEnumerator *__enumerator;

  [super writeJAXBChildElements: writer];

}
@end /* implementation CLUE_SOLVER_RESTNS0Weapon (JAXB) */

#endif /* DEF_CLUE_SOLVER_RESTNS0Weapon_M */
#ifndef DEF_CLUE_SOLVER_RESTNS0Suspect_M
#define DEF_CLUE_SOLVER_RESTNS0Suspect_M

/**
 * (no documentation provided)
 */
@implementation CLUE_SOLVER_RESTNS0Suspect

- (void) dealloc
{
  [super dealloc];
}

//documentation inherited.
+ (id<EnunciateXML>) readFromXML: (NSData *) xml
{
  CLUE_SOLVER_RESTNS0Suspect *_cLUE_SOLVER_RESTNS0Suspect;
  xmlTextReaderPtr reader = xmlReaderForMemory([xml bytes], [xml length], NULL, NULL, 0);
  if (reader == NULL) {
    [NSException raise: @"XMLReadError"
                 format: @"Error instantiating an XML reader."];
    return nil;
  }

  _cLUE_SOLVER_RESTNS0Suspect = (CLUE_SOLVER_RESTNS0Suspect *) [CLUE_SOLVER_RESTNS0Suspect readXMLElement: reader];
  xmlFreeTextReader(reader); //free the reader
  return _cLUE_SOLVER_RESTNS0Suspect;
}

//documentation inherited.
- (NSData *) writeToXML
{
  xmlBufferPtr buf;
  xmlTextWriterPtr writer;
  int rc;
  NSData *data;

  buf = xmlBufferCreate();
  if (buf == NULL) {
    [NSException raise: @"XMLWriteError"
                 format: @"Error creating an XML buffer."];
    return nil;
  }

  writer = xmlNewTextWriterMemory(buf, 0);
  if (writer == NULL) {
    xmlBufferFree(buf);
    [NSException raise: @"XMLWriteError"
                 format: @"Error creating an XML writer."];
    return nil;
  }

  rc = xmlTextWriterStartDocument(writer, NULL, "utf-8", NULL);
  if (rc < 0) {
    xmlFreeTextWriter(writer);
    xmlBufferFree(buf);
    [NSException raise: @"XMLWriteError"
                 format: @"Error writing XML start document."];
    return nil;
  }

  NS_DURING
  {
    [self writeXMLElement: writer];
  }
  NS_HANDLER
  {
    xmlFreeTextWriter(writer);
    xmlBufferFree(buf);
    [localException raise];
  }
  NS_ENDHANDLER

  rc = xmlTextWriterEndDocument(writer);
  if (rc < 0) {
    xmlFreeTextWriter(writer);
    xmlBufferFree(buf);
    [NSException raise: @"XMLWriteError"
                 format: @"Error writing XML end document."];
    return nil;
  }

  xmlFreeTextWriter(writer);
  data = [NSData dataWithBytes: buf->content length: buf->use];
  xmlBufferFree(buf);
  return data;
}
@end /* implementation CLUE_SOLVER_RESTNS0Suspect */

/**
 * Internal, private interface for JAXB reading and writing.
 */
@interface CLUE_SOLVER_RESTNS0Suspect (JAXB) <JAXBReading, JAXBWriting, JAXBType, JAXBElement>

@end /*interface CLUE_SOLVER_RESTNS0Suspect (JAXB)*/

/**
 * Internal, private implementation for JAXB reading and writing.
 */
@implementation CLUE_SOLVER_RESTNS0Suspect (JAXB)

/**
 * Read an instance of CLUE_SOLVER_RESTNS0Suspect from an XML reader.
 *
 * @param reader The reader.
 * @return An instance of CLUE_SOLVER_RESTNS0Suspect defined by the XML reader.
 */
+ (id<JAXBType>) readXMLType: (xmlTextReaderPtr) reader
{
  CLUE_SOLVER_RESTNS0Suspect *_cLUE_SOLVER_RESTNS0Suspect = [[CLUE_SOLVER_RESTNS0Suspect alloc] init];
  NS_DURING
  {
    [_cLUE_SOLVER_RESTNS0Suspect initWithReader: reader];
  }
  NS_HANDLER
  {
    _cLUE_SOLVER_RESTNS0Suspect = nil;
    [localException raise];
  }
  NS_ENDHANDLER

  [_cLUE_SOLVER_RESTNS0Suspect autorelease];
  return _cLUE_SOLVER_RESTNS0Suspect;
}

/**
 * Initialize this instance of CLUE_SOLVER_RESTNS0Suspect according to
 * the XML being read from the reader.
 *
 * @param reader The reader.
 */
- (id) initWithReader: (xmlTextReaderPtr) reader
{
  return [super initWithReader: reader];
}

/**
 * Write the XML for this instance of CLUE_SOLVER_RESTNS0Suspect to the writer.
 * Note that since we're only writing the XML type,
 * No start/end element will be written.
 *
 * @param reader The reader.
 */
- (void) writeXMLType: (xmlTextWriterPtr) writer
{
  [super writeXMLType:writer];
}

/**
 * Reads a CLUE_SOLVER_RESTNS0Suspect from an XML reader. The element to be read is
 * "suspect".
 *
 * @param reader The XML reader.
 * @return The CLUE_SOLVER_RESTNS0Suspect.
 */
+ (id<JAXBElement>) readXMLElement: (xmlTextReaderPtr) reader {
  int status;
  CLUE_SOLVER_RESTNS0Suspect *_suspect = nil;

  if (xmlTextReaderNodeType(reader) != XML_READER_TYPE_ELEMENT) {
    status = xmlTextReaderAdvanceToNextStartOrEndElement(reader);
    if (status < 1) {
      [NSException raise: @"XMLReadError"
                   format: @"Error advancing the reader to start element suspect."];
    }
  }

  if (xmlStrcmp(BAD_CAST "suspect", xmlTextReaderConstLocalName(reader)) == 0
      && xmlTextReaderConstNamespaceUri(reader) == NULL) {
#if DEBUG_ENUNCIATE > 1
    NSLog(@"Attempting to read root element {}suspect.");
#endif
    _suspect = (CLUE_SOLVER_RESTNS0Suspect *)[CLUE_SOLVER_RESTNS0Suspect readXMLType: reader];
#if DEBUG_ENUNCIATE > 1
    NSLog(@"Successfully read root element {}suspect.");
#endif
  }
  else {
    if (xmlTextReaderConstNamespaceUri(reader) == NULL) {
      [NSException raise: @"XMLReadError"
                   format: @"Unable to read CLUE_SOLVER_RESTNS0Suspect. Expected element suspect. Current element: {}%s", xmlTextReaderConstLocalName(reader)];
    }
    else {
      [NSException raise: @"XMLReadError"
                   format: @"Unable to read CLUE_SOLVER_RESTNS0Suspect. Expected element suspect. Current element: {%s}%s\n", xmlTextReaderConstNamespaceUri(reader), xmlTextReaderConstLocalName(reader)];
    }
  }

  return _suspect;
}

/**
 * Writes this CLUE_SOLVER_RESTNS0Suspect to XML under element name "suspect".
 * The namespace declarations for the element will be written.
 *
 * @param writer The XML writer.
 * @param _suspect The Suspect to write.
 * @return 1 if successful, 0 otherwise.
 */
- (void) writeXMLElement: (xmlTextWriterPtr) writer
{
  [self writeXMLElement: writer writeNamespaces: YES];
}

/**
 * Writes this CLUE_SOLVER_RESTNS0Suspect to an XML writer.
 *
 * @param writer The writer.
 * @param writeNs Whether to write the namespaces for this element to the xml writer.
 */
- (void) writeXMLElement: (xmlTextWriterPtr) writer writeNamespaces: (BOOL) writeNs
{
  int rc = xmlTextWriterStartElementNS(writer, NULL, BAD_CAST "suspect", NULL);
  if (rc < 0) {
    [NSException raise: @"XMLWriteError"
                 format: @"Error writing start element {}suspect. XML writer status: %i\n", rc];
  }

#if DEBUG_ENUNCIATE > 1
  NSLog(@"writing type {}suspect for root element {}suspect...");
#endif
  [self writeXMLType: writer];
#if DEBUG_ENUNCIATE > 1
  NSLog(@"successfully wrote type {}suspect for root element {}suspect...");
#endif
  rc = xmlTextWriterEndElement(writer);
  if (rc < 0) {
    [NSException raise: @"XMLWriteError"
                 format: @"Error writing end element {}suspect. XML writer status: %i\n", rc];
  }
}

//documentation inherited.
- (BOOL) readJAXBAttribute: (xmlTextReaderPtr) reader
{
  void *_child_accessor;

  if ([super readJAXBAttribute: reader]) {
    return YES;
  }

  return NO;
}

//documentation inherited.
- (BOOL) readJAXBValue: (xmlTextReaderPtr) reader
{
  return [super readJAXBValue: reader];
}

//documentation inherited.
- (BOOL) readJAXBChildElement: (xmlTextReaderPtr) reader
{
  id __child;
  void *_child_accessor;
  int status, depth;

  if ([super readJAXBChildElement: reader]) {
    return YES;
  }

  return NO;
}

//documentation inherited.
- (int) readUnknownJAXBChildElement: (xmlTextReaderPtr) reader
{
  return [super readUnknownJAXBChildElement: reader];
}

//documentation inherited.
- (void) readUnknownJAXBAttribute: (xmlTextReaderPtr) reader
{
  [super readUnknownJAXBAttribute: reader];
}

//documentation inherited.
- (void) writeJAXBAttributes: (xmlTextWriterPtr) writer
{
  int status;

  [super writeJAXBAttributes: writer];

}

//documentation inherited.
- (void) writeJAXBValue: (xmlTextWriterPtr) writer
{
  [super writeJAXBValue: writer];
}

/**
 * Method for writing the child elements.
 *
 * @param writer The writer.
 */
- (void) writeJAXBChildElements: (xmlTextWriterPtr) writer
{
  int status;
  id __item;
  NSEnumerator *__enumerator;

  [super writeJAXBChildElements: writer];

}
@end /* implementation CLUE_SOLVER_RESTNS0Suspect (JAXB) */

#endif /* DEF_CLUE_SOLVER_RESTNS0Suspect_M */
#ifndef DEF_CLUE_SOLVER_RESTNS0Room_M
#define DEF_CLUE_SOLVER_RESTNS0Room_M

/**
 * (no documentation provided)
 */
@implementation CLUE_SOLVER_RESTNS0Room

- (void) dealloc
{
  [super dealloc];
}

//documentation inherited.
+ (id<EnunciateXML>) readFromXML: (NSData *) xml
{
  CLUE_SOLVER_RESTNS0Room *_cLUE_SOLVER_RESTNS0Room;
  xmlTextReaderPtr reader = xmlReaderForMemory([xml bytes], [xml length], NULL, NULL, 0);
  if (reader == NULL) {
    [NSException raise: @"XMLReadError"
                 format: @"Error instantiating an XML reader."];
    return nil;
  }

  _cLUE_SOLVER_RESTNS0Room = (CLUE_SOLVER_RESTNS0Room *) [CLUE_SOLVER_RESTNS0Room readXMLElement: reader];
  xmlFreeTextReader(reader); //free the reader
  return _cLUE_SOLVER_RESTNS0Room;
}

//documentation inherited.
- (NSData *) writeToXML
{
  xmlBufferPtr buf;
  xmlTextWriterPtr writer;
  int rc;
  NSData *data;

  buf = xmlBufferCreate();
  if (buf == NULL) {
    [NSException raise: @"XMLWriteError"
                 format: @"Error creating an XML buffer."];
    return nil;
  }

  writer = xmlNewTextWriterMemory(buf, 0);
  if (writer == NULL) {
    xmlBufferFree(buf);
    [NSException raise: @"XMLWriteError"
                 format: @"Error creating an XML writer."];
    return nil;
  }

  rc = xmlTextWriterStartDocument(writer, NULL, "utf-8", NULL);
  if (rc < 0) {
    xmlFreeTextWriter(writer);
    xmlBufferFree(buf);
    [NSException raise: @"XMLWriteError"
                 format: @"Error writing XML start document."];
    return nil;
  }

  NS_DURING
  {
    [self writeXMLElement: writer];
  }
  NS_HANDLER
  {
    xmlFreeTextWriter(writer);
    xmlBufferFree(buf);
    [localException raise];
  }
  NS_ENDHANDLER

  rc = xmlTextWriterEndDocument(writer);
  if (rc < 0) {
    xmlFreeTextWriter(writer);
    xmlBufferFree(buf);
    [NSException raise: @"XMLWriteError"
                 format: @"Error writing XML end document."];
    return nil;
  }

  xmlFreeTextWriter(writer);
  data = [NSData dataWithBytes: buf->content length: buf->use];
  xmlBufferFree(buf);
  return data;
}
@end /* implementation CLUE_SOLVER_RESTNS0Room */

/**
 * Internal, private interface for JAXB reading and writing.
 */
@interface CLUE_SOLVER_RESTNS0Room (JAXB) <JAXBReading, JAXBWriting, JAXBType, JAXBElement>

@end /*interface CLUE_SOLVER_RESTNS0Room (JAXB)*/

/**
 * Internal, private implementation for JAXB reading and writing.
 */
@implementation CLUE_SOLVER_RESTNS0Room (JAXB)

/**
 * Read an instance of CLUE_SOLVER_RESTNS0Room from an XML reader.
 *
 * @param reader The reader.
 * @return An instance of CLUE_SOLVER_RESTNS0Room defined by the XML reader.
 */
+ (id<JAXBType>) readXMLType: (xmlTextReaderPtr) reader
{
  CLUE_SOLVER_RESTNS0Room *_cLUE_SOLVER_RESTNS0Room = [[CLUE_SOLVER_RESTNS0Room alloc] init];
  NS_DURING
  {
    [_cLUE_SOLVER_RESTNS0Room initWithReader: reader];
  }
  NS_HANDLER
  {
    _cLUE_SOLVER_RESTNS0Room = nil;
    [localException raise];
  }
  NS_ENDHANDLER

  [_cLUE_SOLVER_RESTNS0Room autorelease];
  return _cLUE_SOLVER_RESTNS0Room;
}

/**
 * Initialize this instance of CLUE_SOLVER_RESTNS0Room according to
 * the XML being read from the reader.
 *
 * @param reader The reader.
 */
- (id) initWithReader: (xmlTextReaderPtr) reader
{
  return [super initWithReader: reader];
}

/**
 * Write the XML for this instance of CLUE_SOLVER_RESTNS0Room to the writer.
 * Note that since we're only writing the XML type,
 * No start/end element will be written.
 *
 * @param reader The reader.
 */
- (void) writeXMLType: (xmlTextWriterPtr) writer
{
  [super writeXMLType:writer];
}

/**
 * Reads a CLUE_SOLVER_RESTNS0Room from an XML reader. The element to be read is
 * "room".
 *
 * @param reader The XML reader.
 * @return The CLUE_SOLVER_RESTNS0Room.
 */
+ (id<JAXBElement>) readXMLElement: (xmlTextReaderPtr) reader {
  int status;
  CLUE_SOLVER_RESTNS0Room *_room = nil;

  if (xmlTextReaderNodeType(reader) != XML_READER_TYPE_ELEMENT) {
    status = xmlTextReaderAdvanceToNextStartOrEndElement(reader);
    if (status < 1) {
      [NSException raise: @"XMLReadError"
                   format: @"Error advancing the reader to start element room."];
    }
  }

  if (xmlStrcmp(BAD_CAST "room", xmlTextReaderConstLocalName(reader)) == 0
      && xmlTextReaderConstNamespaceUri(reader) == NULL) {
#if DEBUG_ENUNCIATE > 1
    NSLog(@"Attempting to read root element {}room.");
#endif
    _room = (CLUE_SOLVER_RESTNS0Room *)[CLUE_SOLVER_RESTNS0Room readXMLType: reader];
#if DEBUG_ENUNCIATE > 1
    NSLog(@"Successfully read root element {}room.");
#endif
  }
  else {
    if (xmlTextReaderConstNamespaceUri(reader) == NULL) {
      [NSException raise: @"XMLReadError"
                   format: @"Unable to read CLUE_SOLVER_RESTNS0Room. Expected element room. Current element: {}%s", xmlTextReaderConstLocalName(reader)];
    }
    else {
      [NSException raise: @"XMLReadError"
                   format: @"Unable to read CLUE_SOLVER_RESTNS0Room. Expected element room. Current element: {%s}%s\n", xmlTextReaderConstNamespaceUri(reader), xmlTextReaderConstLocalName(reader)];
    }
  }

  return _room;
}

/**
 * Writes this CLUE_SOLVER_RESTNS0Room to XML under element name "room".
 * The namespace declarations for the element will be written.
 *
 * @param writer The XML writer.
 * @param _room The Room to write.
 * @return 1 if successful, 0 otherwise.
 */
- (void) writeXMLElement: (xmlTextWriterPtr) writer
{
  [self writeXMLElement: writer writeNamespaces: YES];
}

/**
 * Writes this CLUE_SOLVER_RESTNS0Room to an XML writer.
 *
 * @param writer The writer.
 * @param writeNs Whether to write the namespaces for this element to the xml writer.
 */
- (void) writeXMLElement: (xmlTextWriterPtr) writer writeNamespaces: (BOOL) writeNs
{
  int rc = xmlTextWriterStartElementNS(writer, NULL, BAD_CAST "room", NULL);
  if (rc < 0) {
    [NSException raise: @"XMLWriteError"
                 format: @"Error writing start element {}room. XML writer status: %i\n", rc];
  }

#if DEBUG_ENUNCIATE > 1
  NSLog(@"writing type {}room for root element {}room...");
#endif
  [self writeXMLType: writer];
#if DEBUG_ENUNCIATE > 1
  NSLog(@"successfully wrote type {}room for root element {}room...");
#endif
  rc = xmlTextWriterEndElement(writer);
  if (rc < 0) {
    [NSException raise: @"XMLWriteError"
                 format: @"Error writing end element {}room. XML writer status: %i\n", rc];
  }
}

//documentation inherited.
- (BOOL) readJAXBAttribute: (xmlTextReaderPtr) reader
{
  void *_child_accessor;

  if ([super readJAXBAttribute: reader]) {
    return YES;
  }

  return NO;
}

//documentation inherited.
- (BOOL) readJAXBValue: (xmlTextReaderPtr) reader
{
  return [super readJAXBValue: reader];
}

//documentation inherited.
- (BOOL) readJAXBChildElement: (xmlTextReaderPtr) reader
{
  id __child;
  void *_child_accessor;
  int status, depth;

  if ([super readJAXBChildElement: reader]) {
    return YES;
  }

  return NO;
}

//documentation inherited.
- (int) readUnknownJAXBChildElement: (xmlTextReaderPtr) reader
{
  return [super readUnknownJAXBChildElement: reader];
}

//documentation inherited.
- (void) readUnknownJAXBAttribute: (xmlTextReaderPtr) reader
{
  [super readUnknownJAXBAttribute: reader];
}

//documentation inherited.
- (void) writeJAXBAttributes: (xmlTextWriterPtr) writer
{
  int status;

  [super writeJAXBAttributes: writer];

}

//documentation inherited.
- (void) writeJAXBValue: (xmlTextWriterPtr) writer
{
  [super writeJAXBValue: writer];
}

/**
 * Method for writing the child elements.
 *
 * @param writer The writer.
 */
- (void) writeJAXBChildElements: (xmlTextWriterPtr) writer
{
  int status;
  id __item;
  NSEnumerator *__enumerator;

  [super writeJAXBChildElements: writer];

}
@end /* implementation CLUE_SOLVER_RESTNS0Room (JAXB) */

#endif /* DEF_CLUE_SOLVER_RESTNS0Room_M */
