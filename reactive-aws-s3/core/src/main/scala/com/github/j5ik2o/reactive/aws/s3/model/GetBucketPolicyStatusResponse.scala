package com.github.j5ik2o.reactive.aws.s3.model

import com.github.j5ik2o.reactive.aws.model.AbstractResponse

final case class GetBucketPolicyStatusResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    policyStatus: Option[PolicyStatus] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = GetBucketPolicyStatusResponse
  override def withStatusCode(value: Option[Int]): GetBucketPolicyStatusResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): GetBucketPolicyStatusResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): GetBucketPolicyStatusResponse =
    copy(httpHeaders = value)
  def withPolicyStatus(value: Option[PolicyStatus]): GetBucketPolicyStatusResponse =
    copy(policyStatus = value)
}
