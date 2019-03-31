package com.github.j5ik2o.reactive.aws.s3.model

import com.github.j5ik2o.reactive.aws.model.AbstractResponse

final case class GetBucketAclResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    owner: Option[Owner] = None,
    grants: Option[Seq[Grant]] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = GetBucketAclResponse
  override def withStatusCode(value: Option[Int]): GetBucketAclResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): GetBucketAclResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): GetBucketAclResponse =
    copy(httpHeaders = value)
  def withOwner(value: Option[Owner]): GetBucketAclResponse =
    copy(owner = value)
  def withGrants(value: Option[Seq[Grant]]): GetBucketAclResponse =
    copy(grants = value)
}
