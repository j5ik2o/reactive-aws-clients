package com.github.j5ik2o.reactive.aws.s3.model.rs

import com.github.j5ik2o.reactive.aws.s3.model.{ CommonPrefix, ListObjectsV2Response, S3Object }

import scala.collection.JavaConverters._

class ListObjectsV2IterableImpl(self: software.amazon.awssdk.services.s3.paginators.ListObjectsV2Iterable)
    extends ListObjectsV2Iterable {

  import com.github.j5ik2o.reactive.aws.s3.model.ops.CommonPrefixOps._
  import com.github.j5ik2o.reactive.aws.s3.model.ops.ListObjectsV2ResponseOps._
  import com.github.j5ik2o.reactive.aws.s3.model.ops.S3ObjectOps._

  override def iterator: Iterator[ListObjectsV2Response] = self.iterator().asScala.map(_.toScala)

  def contents: Iterable[S3Object] = self.contents().asScala.map(_.toScala)

  def commonPrefixes: Iterable[CommonPrefix] = self.commonPrefixes().asScala.map(_.toScala)

}
