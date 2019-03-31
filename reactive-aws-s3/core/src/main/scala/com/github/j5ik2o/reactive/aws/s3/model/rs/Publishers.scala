package com.github.j5ik2o.reactive.aws.s3.model.rs

import com.github.j5ik2o.reactive.aws.s3.model._
import org.reactivestreams.Publisher

trait ListMultipartUploadsPublisher extends Publisher[ListMultipartUploadsResponse] {
  def uploads: Publisher[MultipartUpload]
  def commonPrefixes: Publisher[CommonPrefix]
}

trait ListObjectVersionsPublisher extends Publisher[ListObjectVersionsResponse] {
  def commonPrefixes: Publisher[CommonPrefix]
  def deleteMarkers: Publisher[DeleteMarkerEntry]
  def versions: Publisher[ObjectVersion]
}

trait ListObjectsV2Publisher extends Publisher[ListObjectsV2Response] {
  def contents: Publisher[S3Object]
  def commonPrefixes: Publisher[CommonPrefix]
}

trait ListPartsPublisher extends Publisher[ListPartsResponse] {
  def parts: Publisher[Part]
}
