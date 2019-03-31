package com.github.j5ik2o.reactive.aws.s3.model

import com.github.j5ik2o.reactive.aws.model.AbstractResponse

final case class GetBucketReplicationResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    replicationConfiguration: Option[ReplicationConfiguration] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = GetBucketReplicationResponse
  override def withStatusCode(value: Option[Int]): GetBucketReplicationResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): GetBucketReplicationResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): GetBucketReplicationResponse =
    copy(httpHeaders = value)
  def withReplicationConfiguration(value: Option[ReplicationConfiguration]): GetBucketReplicationResponse =
    copy(replicationConfiguration = value)
}
