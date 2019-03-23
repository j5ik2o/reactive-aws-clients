package com.github.j5ik2o.reactive.aws.dynamodb.model

trait AttributeValueSupport { this: AttributeValue =>
  def string: Option[String]                                              = s
  def number: Option[String]                                              = n
  def binary: Option[Array[Byte]]                                         = b
  def strings: Option[Seq[String]]                                        = ss
  def numbers: Option[Seq[String]]                                        = ns
  def binaries: Option[Seq[Array[Byte]]]                                  = bs
  def map: Option[Map[String, AttributeValue]]                            = m
  def list: Option[Seq[AttributeValue]]                                   = l
  def nullValue: Option[Boolean]                                          = nul
  def withString(value: Option[String]): AttributeValue                   = withS(value)
  def withNumber(value: Option[String]): AttributeValue                   = withN(value)
  def withBinary(value: Option[Array[Byte]]): AttributeValue              = withB(value)
  def withStrings(value: Option[Seq[String]]): AttributeValue             = withSs(value)
  def withNumbers(value: Option[Seq[String]]): AttributeValue             = withNs(value)
  def withBinaries(value: Option[Seq[Array[Byte]]]): AttributeValue       = withBs(value)
  def withMap(value: Option[Map[String, AttributeValue]]): AttributeValue = withM(value)
  def withList(value: Option[Seq[AttributeValue]]): AttributeValue        = withL(value)
  def withNullValue(value: Option[Boolean]): AttributeValue               = withNul(value)
}
