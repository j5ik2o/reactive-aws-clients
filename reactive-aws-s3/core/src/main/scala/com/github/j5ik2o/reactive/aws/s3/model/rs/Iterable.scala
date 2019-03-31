package com.github.j5ik2o.reactive.aws.s3.model.rs

import com.github.j5ik2o.reactive.aws.s3.model._

trait ListMultipartUploadsIterable extends Iterable[ListMultipartUploadsResponse] {
  def uploads: Iterable[MultipartUpload]
  def commonPrefixes: Iterable[CommonPrefix]
}

trait ListObjectVersionsIterable extends Iterable[ListObjectVersionsResponse] {
  def commonPrefixes: Iterable[CommonPrefix]
  def deleteMarkers: Iterable[DeleteMarkerEntry]
  def versions: Iterable[ObjectVersion]
}

trait ListObjectsV2Iterable extends Iterable[ListObjectsV2Response] {
  def contents: Iterable[S3Object]
  def commonPrefixes: Iterable[CommonPrefix]
}

trait ListPartsIterable extends Iterable[ListPartsResponse] {
  def parts: Iterable[Part]
}
