package com.github.j5ik2o.reactive.aws.s3.model

import enumeratum._

import scala.collection.immutable

sealed trait BucketLocationConstraint extends EnumEntry

object BucketLocationConstraint extends Enum[BucketLocationConstraint] {
  override def values: immutable.IndexedSeq[BucketLocationConstraint] = findValues

  case object CN_NORTH_1     extends BucketLocationConstraint
  case object SA_EAST_1      extends BucketLocationConstraint
  case object AP_NORTHEAST_1 extends BucketLocationConstraint
  case object AP_SOUTH_1     extends BucketLocationConstraint
  case object US_WEST_2      extends BucketLocationConstraint
  case object EU             extends BucketLocationConstraint
  case object US_WEST_1      extends BucketLocationConstraint
  case object EU_CENTRAL_1   extends BucketLocationConstraint
  case object AP_SOUTHEAST_1 extends BucketLocationConstraint
  case object AP_SOUTHEAST_2 extends BucketLocationConstraint
  case object EU_WEST_1      extends BucketLocationConstraint
}
