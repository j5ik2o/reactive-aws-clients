package com.github.j5ik2o.reactive.aws.s3.model

import com.github.j5ik2o.reactive.aws.model.AbstractResponse

final case class GetObjectAclResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    owner: Option[Owner] = None,
    grants: Option[Seq[Grant]] = None,
    requestCharged: Option[RequestCharged] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = GetObjectAclResponse
  override def withStatusCode(value: Option[Int]): GetObjectAclResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): GetObjectAclResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): GetObjectAclResponse =
    copy(httpHeaders = value)
  def withOwner(value: Option[Owner]): GetObjectAclResponse =
    copy(owner = value)
  def withGrants(value: Option[Seq[Grant]]): GetObjectAclResponse =
    copy(grants = value)
  def withRequestCharged(value: Option[RequestCharged]): GetObjectAclResponse =
    copy(requestCharged = value)
}
