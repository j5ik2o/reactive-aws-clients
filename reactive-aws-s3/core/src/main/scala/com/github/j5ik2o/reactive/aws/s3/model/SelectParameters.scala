package com.github.j5ik2o.reactive.aws.s3.model

final case class SelectParameters(
    inputSerialization: Option[InputSerialization] = None,
    expressionType: Option[ExpressionType] = None,
    expression: Option[String] = None,
    outputSerialization: Option[OutputSerialization] = None
) {
  def withInputSerialization(value: Option[InputSerialization]): SelectParameters =
    copy(inputSerialization = value)
  def withExpressionType(value: Option[ExpressionType]): SelectParameters =
    copy(expressionType = value)
  def withExpression(value: Option[String]): SelectParameters =
    copy(expression = value)
  def withOutputSerialization(value: Option[OutputSerialization]): SelectParameters =
    copy(outputSerialization = value)
}
