package com.github.j5ik2o.reactive.dynamodb.model

final case class StreamSpecification(streamEnabled: Option[Boolean] = None,
                                     streamViewType: Option[StreamViewType] = None) {
  def withStreamEnabled(value: Option[Boolean]): StreamSpecification         = copy(streamEnabled = value)
  def withStreamViewType(value: Option[StreamViewType]): StreamSpecification = copy(streamViewType = value)
}
