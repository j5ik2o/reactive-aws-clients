package com.github.j5ik2o.reactive.aws.s3.model.rs

import com.github.j5ik2o.reactive.aws.s3.model.{ CommonPrefix, ListMultipartUploadsResponse, MultipartUpload }

import scala.collection.JavaConverters._

private[s3] class ListMultipartUploadsIterableImpl(
    self: software.amazon.awssdk.services.s3.paginators.ListMultipartUploadsIterable
) extends ListMultipartUploadsIterable {

  import com.github.j5ik2o.reactive.aws.s3.model.ops.CommonPrefixOps._
  import com.github.j5ik2o.reactive.aws.s3.model.ops.ListMultipartUploadsResponseOps._
  import com.github.j5ik2o.reactive.aws.s3.model.ops.MultipartUploadOps._

  override def iterator: Iterator[ListMultipartUploadsResponse] = self.iterator().asScala.map(_.toScala)

  def uploads: Iterable[MultipartUpload] = self.uploads().asScala.map(_.toScala)

  def commonPrefixes: Iterable[CommonPrefix] = self.commonPrefixes.asScala.map(_.toScala)
}
