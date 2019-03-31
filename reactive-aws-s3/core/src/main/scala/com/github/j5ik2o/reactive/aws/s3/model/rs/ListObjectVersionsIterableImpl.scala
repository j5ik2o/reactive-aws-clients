package com.github.j5ik2o.reactive.aws.s3.model.rs

import com.github.j5ik2o.reactive.aws.s3.model.{
  CommonPrefix,
  DeleteMarkerEntry,
  ListObjectVersionsResponse,
  ObjectVersion
}

import scala.collection.JavaConverters._

class ListObjectVersionsIterableImpl(self: software.amazon.awssdk.services.s3.paginators.ListObjectVersionsIterable)
    extends ListObjectVersionsIterable {

  import com.github.j5ik2o.reactive.aws.s3.model.ops.CommonPrefixOps._
  import com.github.j5ik2o.reactive.aws.s3.model.ops.DeleteMarkerEntryOps._
  import com.github.j5ik2o.reactive.aws.s3.model.ops.ListObjectVersionsResponseOps._
  import com.github.j5ik2o.reactive.aws.s3.model.ops.ObjectVersionOps._

  override def iterator: Iterator[ListObjectVersionsResponse] = self.iterator().asScala.map(_.toScala)

  def commonPrefixes: Iterable[CommonPrefix] = self.commonPrefixes().asScala.map(_.toScala)

  def deleteMarkers: Iterable[DeleteMarkerEntry] = self.deleteMarkers().asScala.map(_.toScala)

  def versions: Iterable[ObjectVersion] = self.versions().asScala.map(_.toScala)
}
