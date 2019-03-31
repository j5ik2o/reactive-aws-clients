package com.github.j5ik2o.reactive.aws.kinesis.model

import com.github.j5ik2o.reactive.aws.model.AbstractResponse

final case class ListShardsResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    shards: Option[Seq[Shard]] = None,
    nextToken: Option[String] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = ListShardsResponse
  override def withStatusCode(value: Option[Int]): ListShardsResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): ListShardsResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): ListShardsResponse =
    copy(httpHeaders = value)
  def withShards(value: Option[Seq[Shard]]): ListShardsResponse =
    copy(shards = value)
  def withNextToken(value: Option[String]): ListShardsResponse =
    copy(nextToken = value)
}
