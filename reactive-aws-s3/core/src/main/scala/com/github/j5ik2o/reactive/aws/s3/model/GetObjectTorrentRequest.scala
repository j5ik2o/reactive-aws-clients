package com.github.j5ik2o.reactive.aws.s3.model

final case class GetObjectTorrentRequest(
    bucket: Option[String] = None,
    key: Option[String] = None,
    requestPayer: Option[RequestPayer] = None
) {
  def withBucket(value: Option[String]): GetObjectTorrentRequest =
    copy(bucket = value)
  def withKey(value: Option[String]): GetObjectTorrentRequest =
    copy(key = value)
  def withRequestPayer(value: Option[RequestPayer]): GetObjectTorrentRequest =
    copy(requestPayer = value)
}
