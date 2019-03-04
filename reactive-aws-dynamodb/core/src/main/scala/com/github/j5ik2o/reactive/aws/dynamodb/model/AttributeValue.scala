package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class AttributeValue(string: Option[String] = None,
                                number: Option[String] = None,
                                binary: Option[Array[Byte]] = None,
                                strings: Option[Seq[String]] = None,
                                numbers: Option[Seq[String]] = None,
                                binaries: Option[Seq[Array[Byte]]] = None,
                                map: Option[Map[String, AttributeValue]] = None,
                                list: Option[Seq[AttributeValue]] = None,
                                nullValue: Option[Boolean] = None,
                                bool: Option[Boolean] = None) {
  def withString(value: Option[String]): AttributeValue                   = copy(string = value)
  def withNumber(value: Option[String]): AttributeValue                   = copy(number = value)
  def withBinary(value: Option[Array[Byte]]): AttributeValue              = copy(binary = value)
  def withStrings(value: Option[Seq[String]]): AttributeValue             = copy(strings = value)
  def withNumbers(value: Option[Seq[String]]): AttributeValue             = copy(numbers = value)
  def withBinaries(value: Option[Seq[Array[Byte]]]): AttributeValue       = copy(binaries = value)
  def withMap(value: Option[Map[String, AttributeValue]]): AttributeValue = copy(map = value)
  def withList(value: Option[Seq[AttributeValue]]): AttributeValue        = copy(list = value)
  def withNullValue(value: Option[Boolean]): AttributeValue               = copy(nullValue = value)
  def withBool(value: Option[Boolean]): AttributeValue                    = copy(bool = value)
}
