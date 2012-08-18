#import "enunciate-common.h"

@class CLUE_SOLVER_RESTNS0Probability;
@class CLUE_SOLVER_RESTNS0Triple;
@class CLUE_SOLVER_RESTNS0ClueServerStatus;
@class CLUE_SOLVER_RESTNS0ProbabilityReport;
@class CLUE_SOLVER_RESTNS0Card;
@class CLUE_SOLVER_RESTNS0Weapon;
@class CLUE_SOLVER_RESTNS0Suspect;
@class CLUE_SOLVER_RESTNS0Room;

#ifndef DEF_CLUE_SOLVER_RESTNS0Probability_H
#define DEF_CLUE_SOLVER_RESTNS0Probability_H

/**
 * (no documentation provided)
 */
@interface CLUE_SOLVER_RESTNS0Probability : NSObject <EnunciateXML>
{
  @private
    double _cardProbability;
    NSArray *_wrappedObject;
}

/**
 * (no documentation provided)
 */
- (double) cardProbability;

/**
 * (no documentation provided)
 */
- (void) setCardProbability: (double) newCardProbability;

/**
 * (no documentation provided)
 *
 * Contains instances of JAXBBasicXMLNode.
 */
- (NSArray *) wrappedObject;

/**
 * (no documentation provided)
 *
 * Contains instances of JAXBBasicXMLNode.
 */
- (void) setWrappedObject: (NSArray *) newWrappedObject;
@end /* interface CLUE_SOLVER_RESTNS0Probability */

#endif /* DEF_CLUE_SOLVER_RESTNS0Probability_H */
#ifndef DEF_CLUE_SOLVER_RESTNS0Triple_H
#define DEF_CLUE_SOLVER_RESTNS0Triple_H

/**
 * (no documentation provided)
 */
@interface CLUE_SOLVER_RESTNS0Triple : NSObject <EnunciateXML>
{
  @private
    CLUE_SOLVER_RESTNS0Suspect *_suspect;
    CLUE_SOLVER_RESTNS0Room *_room;
    CLUE_SOLVER_RESTNS0Weapon *_weapon;
}

/**
 * (no documentation provided)
 */
- (CLUE_SOLVER_RESTNS0Suspect *) suspect;

/**
 * (no documentation provided)
 */
- (void) setSuspect: (CLUE_SOLVER_RESTNS0Suspect *) newSuspect;

/**
 * (no documentation provided)
 */
- (CLUE_SOLVER_RESTNS0Room *) room;

/**
 * (no documentation provided)
 */
- (void) setRoom: (CLUE_SOLVER_RESTNS0Room *) newRoom;

/**
 * (no documentation provided)
 */
- (CLUE_SOLVER_RESTNS0Weapon *) weapon;

/**
 * (no documentation provided)
 */
- (void) setWeapon: (CLUE_SOLVER_RESTNS0Weapon *) newWeapon;
@end /* interface CLUE_SOLVER_RESTNS0Triple */

#endif /* DEF_CLUE_SOLVER_RESTNS0Triple_H */
#ifndef DEF_CLUE_SOLVER_RESTNS0ClueServerStatus_H
#define DEF_CLUE_SOLVER_RESTNS0ClueServerStatus_H

/**
 * (no documentation provided)
 */
@interface CLUE_SOLVER_RESTNS0ClueServerStatus : NSObject <EnunciateXML>
{
  @private
    NSArray *_remainingTriples;
    NSArray *_remainingCards;
}

/**
 * (no documentation provided)
 */
- (NSArray *) remainingTriples;

/**
 * (no documentation provided)
 */
- (void) setRemainingTriples: (NSArray *) newRemainingTriples;

/**
 * (no documentation provided)
 */
- (NSArray *) remainingCards;

/**
 * (no documentation provided)
 */
- (void) setRemainingCards: (NSArray *) newRemainingCards;
@end /* interface CLUE_SOLVER_RESTNS0ClueServerStatus */

#endif /* DEF_CLUE_SOLVER_RESTNS0ClueServerStatus_H */
#ifndef DEF_CLUE_SOLVER_RESTNS0ProbabilityReport_H
#define DEF_CLUE_SOLVER_RESTNS0ProbabilityReport_H

/**
 * (no documentation provided)
 */
@interface CLUE_SOLVER_RESTNS0ProbabilityReport : NSObject <EnunciateXML>
{
  @private
    NSArray *_rooms;
    CLUE_SOLVER_RESTNS0Probability *_mostLikelyWeapon;
    CLUE_SOLVER_RESTNS0Probability *_mostLikelyRoom;
    NSArray *_weapons;
    CLUE_SOLVER_RESTNS0Probability *_mostLikelyTriple;
    CLUE_SOLVER_RESTNS0Probability *_mostLikelySuspect;
    NSArray *_suspects;
}

/**
 * (no documentation provided)
 */
- (NSArray *) rooms;

/**
 * (no documentation provided)
 */
- (void) setRooms: (NSArray *) newRooms;

/**
 * (no documentation provided)
 */
- (CLUE_SOLVER_RESTNS0Probability *) mostLikelyWeapon;

/**
 * (no documentation provided)
 */
- (void) setMostLikelyWeapon: (CLUE_SOLVER_RESTNS0Probability *) newMostLikelyWeapon;

/**
 * (no documentation provided)
 */
- (CLUE_SOLVER_RESTNS0Probability *) mostLikelyRoom;

/**
 * (no documentation provided)
 */
- (void) setMostLikelyRoom: (CLUE_SOLVER_RESTNS0Probability *) newMostLikelyRoom;

/**
 * (no documentation provided)
 */
- (NSArray *) weapons;

/**
 * (no documentation provided)
 */
- (void) setWeapons: (NSArray *) newWeapons;

/**
 * (no documentation provided)
 */
- (CLUE_SOLVER_RESTNS0Probability *) mostLikelyTriple;

/**
 * (no documentation provided)
 */
- (void) setMostLikelyTriple: (CLUE_SOLVER_RESTNS0Probability *) newMostLikelyTriple;

/**
 * (no documentation provided)
 */
- (CLUE_SOLVER_RESTNS0Probability *) mostLikelySuspect;

/**
 * (no documentation provided)
 */
- (void) setMostLikelySuspect: (CLUE_SOLVER_RESTNS0Probability *) newMostLikelySuspect;

/**
 * (no documentation provided)
 */
- (NSArray *) suspects;

/**
 * (no documentation provided)
 */
- (void) setSuspects: (NSArray *) newSuspects;
@end /* interface CLUE_SOLVER_RESTNS0ProbabilityReport */

#endif /* DEF_CLUE_SOLVER_RESTNS0ProbabilityReport_H */
#ifndef DEF_CLUE_SOLVER_RESTNS0Card_H
#define DEF_CLUE_SOLVER_RESTNS0Card_H

/**
 * (no documentation provided)
 */
@interface CLUE_SOLVER_RESTNS0Card : NSObject <EnunciateXML>
{
  @private
    NSString *_name;
    NSString *_type;
}

/**
 * (no documentation provided)
 */
- (NSString *) name;

/**
 * (no documentation provided)
 */
- (void) setName: (NSString *) newName;

/**
 * (no documentation provided)
 */
- (NSString *) type;

/**
 * (no documentation provided)
 */
- (void) setType: (NSString *) newType;
@end /* interface CLUE_SOLVER_RESTNS0Card */

#endif /* DEF_CLUE_SOLVER_RESTNS0Card_H */
#ifndef DEF_CLUE_SOLVER_RESTNS0Weapon_H
#define DEF_CLUE_SOLVER_RESTNS0Weapon_H

/**
 * (no documentation provided)
 */
@interface CLUE_SOLVER_RESTNS0Weapon : CLUE_SOLVER_RESTNS0Card <EnunciateXML>
{
  @private
}
@end /* interface CLUE_SOLVER_RESTNS0Weapon */

#endif /* DEF_CLUE_SOLVER_RESTNS0Weapon_H */
#ifndef DEF_CLUE_SOLVER_RESTNS0Suspect_H
#define DEF_CLUE_SOLVER_RESTNS0Suspect_H

/**
 * (no documentation provided)
 */
@interface CLUE_SOLVER_RESTNS0Suspect : CLUE_SOLVER_RESTNS0Card <EnunciateXML>
{
  @private
}
@end /* interface CLUE_SOLVER_RESTNS0Suspect */

#endif /* DEF_CLUE_SOLVER_RESTNS0Suspect_H */
#ifndef DEF_CLUE_SOLVER_RESTNS0Room_H
#define DEF_CLUE_SOLVER_RESTNS0Room_H

/**
 * (no documentation provided)
 */
@interface CLUE_SOLVER_RESTNS0Room : CLUE_SOLVER_RESTNS0Card <EnunciateXML>
{
  @private
}
@end /* interface CLUE_SOLVER_RESTNS0Room */

#endif /* DEF_CLUE_SOLVER_RESTNS0Room_H */
