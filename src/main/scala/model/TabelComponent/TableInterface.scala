package model

import scala.collection.mutable.ArrayBuffer
import util.Decks.{Card,Deck}
import control.Ergebnis
trait TableInterface {
  def getDealerHand(): ArrayBuffer[Card]
  def addDealerHand(card: Card): Unit
  def clearDealerhand(): Unit
  def getOutcome(): Ergebnis
  def setOutcome(e: Ergebnis): Unit
  def getPlayerHand(): ArrayBuffer[Card]
  def addPlayerHand(card: Card): Unit
  def clearPlayerHand(): Unit
  def removePlayerHand(card: Card): Unit
  def getDeck(): Deck
  def setDeck(x: Deck): Unit
  def getPlayerName(): String
  def drawNewCard(): Card
  def getPlayerMoney(): Int 
  def increasePlayerMoney(amount: Int): Unit
  def decreasePlayerMoney(amount: Int): Unit
  def setBet(amount:Int):Unit
  def getBet():Int
  def clearBet():Unit
  def setPlayerMoney(amount:Int):Unit
}
