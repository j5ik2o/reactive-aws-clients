package com.github.j5ik2o.reactive.aws.s3.model

final case class LifecycleRule(
    expiration: Option[LifecycleExpiration] = None,
    id: Option[String] = None,
    prefix: Option[String] = None,
    filter: Option[LifecycleRuleFilter] = None,
    status: Option[ExpirationStatus] = None,
    transitions: Option[Seq[Transition]] = None,
    noncurrentVersionTransitions: Option[Seq[NoncurrentVersionTransition]] = None,
    noncurrentVersionExpiration: Option[NoncurrentVersionExpiration] = None,
    abortIncompleteMultipartUpload: Option[AbortIncompleteMultipartUpload] = None
) {
  def withExpiration(value: Option[LifecycleExpiration]): LifecycleRule =
    copy(expiration = value)
  def withId(value: Option[String]): LifecycleRule =
    copy(id = value)
  def withPrefix(value: Option[String]): LifecycleRule =
    copy(prefix = value)
  def withFilter(value: Option[LifecycleRuleFilter]): LifecycleRule =
    copy(filter = value)
  def withStatus(value: Option[ExpirationStatus]): LifecycleRule =
    copy(status = value)
  def withTransitions(value: Option[Seq[Transition]]): LifecycleRule =
    copy(transitions = value)
  def withNoncurrentVersionTransitions(value: Option[Seq[NoncurrentVersionTransition]]): LifecycleRule =
    copy(noncurrentVersionTransitions = value)
  def withNoncurrentVersionExpiration(value: Option[NoncurrentVersionExpiration]): LifecycleRule =
    copy(noncurrentVersionExpiration = value)
  def withAbortIncompleteMultipartUpload(value: Option[AbortIncompleteMultipartUpload]): LifecycleRule =
    copy(abortIncompleteMultipartUpload = value)
}
