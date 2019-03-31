package com.github.j5ik2o.reactive.aws.s3.model

import com.github.j5ik2o.reactive.aws.model.AbstractResponse

final case class GetBucketPolicyResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    policy: Option[String] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = GetBucketPolicyResponse
  override def withStatusCode(value: Option[Int]): GetBucketPolicyResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): GetBucketPolicyResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): GetBucketPolicyResponse =
    copy(httpHeaders = value)
  def withPolicy(value: Option[String]): GetBucketPolicyResponse =
    copy(policy = value)
}
