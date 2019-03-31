package com.github.j5ik2o.reactive.aws.s3.model.rs

import com.github.j5ik2o.reactive.aws.s3.model.{ ListPartsResponse, Part }

import scala.collection.JavaConverters._

class ListPartsIterableImpl(self: software.amazon.awssdk.services.s3.paginators.ListPartsIterable)
    extends ListPartsIterable {

  import com.github.j5ik2o.reactive.aws.s3.model.ops.ListPartsResponseOps._
  import com.github.j5ik2o.reactive.aws.s3.model.ops.PartOps._

  override def iterator: Iterator[ListPartsResponse] = self.iterator().asScala.map(_.toScala)

  def parts: Iterable[Part] = self.parts().asScala.map(_.toScala)

}
