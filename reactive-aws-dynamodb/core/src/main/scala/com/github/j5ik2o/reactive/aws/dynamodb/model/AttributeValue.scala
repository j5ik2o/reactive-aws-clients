package com.github.j5ik2o.reactive.aws.dynamodb.model

import java.time._

final case class AttributeValue(
    s: Option[String] = None,
    n: Option[String] = None,
    b: Option[Array[Byte]] = None,
    ss: Option[Seq[String]] = None,
    ns: Option[Seq[String]] = None,
    bs: Option[Seq[Array[Byte]]] = None,
    m: Option[Map[String, AttributeValue]] = None,
    l: Option[Seq[AttributeValue]] = None,
    bool: Option[Boolean] = None,
    nul: Option[Boolean] = None
) extends AttributeValueSupport {
  def withS(value: Option[String]): AttributeValue =
    copy(s = value)
  def withN(value: Option[String]): AttributeValue =
    copy(n = value)
  def withB(value: Option[Array[Byte]]): AttributeValue =
    copy(b = value)
  def withSs(value: Option[Seq[String]]): AttributeValue =
    copy(ss = value)
  def withNs(value: Option[Seq[String]]): AttributeValue =
    copy(ns = value)
  def withBs(value: Option[Seq[Array[Byte]]]): AttributeValue =
    copy(bs = value)
  def withM(value: Option[Map[String, AttributeValue]]): AttributeValue =
    copy(m = value)
  def withL(value: Option[Seq[AttributeValue]]): AttributeValue =
    copy(l = value)
  def withBool(value: Option[Boolean]): AttributeValue =
    copy(bool = value)
  def withNul(value: Option[Boolean]): AttributeValue =
    copy(nul = value)
}
