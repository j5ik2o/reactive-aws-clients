package com.github.j5ik2o.reactive.dynamodb.model

final case class Projection(projectionType: Option[ProjectionType] = None,
                            nonKeyAttributes: Option[Seq[String]] = None) {
  def withProjectionType(value: Option[ProjectionType]): Projection = copy(projectionType = value)
  def withNonKeyAttributes(value: Option[Seq[String]]): Projection  = copy(nonKeyAttributes = value)
}
