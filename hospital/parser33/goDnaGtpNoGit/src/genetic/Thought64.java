package genetic;
import java.util.ArrayList;
class Thought64 extends Thought{
private static ArrayList<Thought64> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 435.7002851555423;
private double fd1 = 330.76461345792967;
private Thought fo0 = null;
private Thought fo1 = null;
Thought64 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought64 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought64 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought64 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought64 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought64 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought64 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought64 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
public static Thought64 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought64 instance = new Thought64 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought64 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought64 instance = new Thought64 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought64 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought64 instance = new Thought64 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought64 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought64 instance = new Thought64 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought64 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought64 instance = new Thought64 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought64 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought64 instance = new Thought64 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought64 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought64 instance = new Thought64 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought64 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought64 instance = new Thought64 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
void m1() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
    Output.points[8][8] += fd1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[0][0] += fd1;
    Output.points[0][1] += fd0;
    boolean lb0 = false;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    Thought lo0 = Thought334.getInstance();
    ab2 = ab3 && ab4;
if(fo0 != null){
      fb0 = fo0.m2(fb1, ab1, ab2, ab3);
}
        ab4 = fb0 && fb1;
    fd1 = fd0 - fd1;
    ab1 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    Output.points[0][2] -= fd0;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[0][3] -= ad2;
    fb1 = ad3 < ad4;
    fb0 = fb1 && fb0;
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
}
    ad3 = ad4 + fd0;
        fd1 *= -1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
    fb1 = !lb0;
    Thought lo1 = Thought389.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
if(fo0 != null){
      fb0 = fo0.m2();
}
if(fo1 != null){
      fo1.m2(fb1, lb0, fb0, fb1);
}
    lb0 = !fb0;
    fb1 = ad4 > fd0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 || lb0;
if(fo1 != null){
      fb0 = fo1.m2(ad4, fd0, fd1, ad1, fb1, lb0, fb0, fb1);
}
    lb0 = !fb0;
    ad2 = ad3 - ad4;
    Thought lo2 = Thought175.getInstance(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      lb0 = fo1.m2(fd1, ad1, ad2, ad3);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
          fo0.m2();
}
    fd1 *= -1;
    Output.points[0][4] += ad1;
    ab2 = ab3 && ab4;
    ad2 *= -1;
    boolean lb0 = true;
    Thought lo1 = Thought109.getInstance(ab4, fb0, fb1, lb0);
    ab1 = ad3 > ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
    boolean lb2 = true;
    fb0 = fb1 || lb0;
    ad3 = ad4 - fd0;
    lb2 = fd1 > ad1;
    Output.points[0][5] -= ad2;
    ab1 = ab2 && ab3;
    Output.points[0][6] -= ad3;
    Output.points[0][7] += ad4;
    ab4 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    Thought lo3 = Thought305.getInstance();

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fd0 *= -1;
    double ld0 = 319.11488999457055;
    Thought lo1 = Thought225.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
    double ld2 = 596.2662276173494;
    fb0 = !fb1;
if(ao1 != null){
      ao1.m2(fd0, fd1, ld0, ld2, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
    fb1 = fb0 && fb1;
    ld0 = ld2 - fd0;
    fb0 = fd1 > ld0;
if(ao1 != null){
      ld2 = ao1.m3(fd0, fd1, ld0, ld2);
}
    fd0 = fd1 - ld0;
    ld2 = fd0 - fd1;
    ld0 = ld2 + fd0;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought224.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
    Thought lo1 = Thought344.getInstance();
    Thought lo2 = Thought188.getInstance(fb1, fb0, fb1, fb0);
if(fo1 != null){
      fb1 = fo1.m2(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    fb0 = ad4 < fd0;
    fb1 = fb0 && fb1;
    boolean lb3 = true;
    double ld4 = 541.6505991488995;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld4, ad1, lb3, fb0, fb1, lb3);
}
    fb0 = !fb1;
    Output.points[0][8] += ad2;
    lb3 = fb0 && fb1;
    lb3 = ad3 > ad4;
    boolean lb5 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb5, fb0, fb1, lb3);
}
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld4, ad1, ad2);
}
    ad3 = ad4 - fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld4, ad1, ad2);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    Output.points[1][0] += ad3;
    ad4 = fd0 - fd1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought361.getInstance(ab2, ab3, ab4, fb0);
    double ld1 = 829.4804349228001;
    Thought lo2 = Thought57.getInstance(ao1, ao2, ao3, ao4, ld1, fd0, fd1, ld1, fb1, ab1, ab2, ab3);
    double ld3 = 909.4284230718732;
    Output.points[1][1] += ld3;
if(fo0 != null){
      fo0.m2(fd0, fd1, ld1, ld3, ab4, fb0, fb1, ab1);
}
    ab2 = fd0 < fd1;
if(fo1 != null){
      ld1 = fo1.m3(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      ld3 = fo0.m3(fo1, ao1, ao2, ao3);
}
    fd0 = fd1 - ld1;
if(ao4 != null){
      ao4.m1(ld3, fd0, fd1, ld1);
}
    ab1 = ab2 || ab3;
    ld3 = fd0 - fd1;
    double ld4 = 670.5141680420198;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
    ab2 = fd0 > fd1;
    ad1 *= -1;
if(fo1 != null){
      fo1.m1();
}
    ab3 = ab4 || fb0;
    fb1 = ad2 > ad3;
    ab1 = ab2 || ab3;
    ad4 *= -1;
if(ao1 != null){
      ao1.m1(ab4, fb0, fb1, ab1);
}
    fd0 = fd1 - ad1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought313.getInstance(fd1, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
    ad4 = fd0 + fd1;
    boolean lb1 = false;
    ab3 = ad1 > ad2;
    ab4 = fb0 && fb1;
    Output.points[1][2] -= ad3;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, lb1, ab1, ab2, ab3);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 649.4165161849963;
    Output.points[1][3] += fd0;
    fb0 = fb1 || fb0;
    boolean lb1 = true;
    boolean lb2 = false;
        Thought lo3 = Thought331.getInstance(fo1, fo0, fo1, fo0);
    fd1 = ld0 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(ld0, fd0, fd1, ld0);
}
    fd0 *= -1;
    lb2 = fd1 > ld0;
    double ld4 = 946.1281986918036;
    fb0 = ld4 > fd0;
    fb1 = fd1 < ld0;
    for(int i0=0; i0<10; i0++){
        lb1 = !lb2;
        Output.points[1][4] -= ld4;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld4);
}
}
Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought369.getInstance();
    double ld1 = 202.57167155273802;
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld1, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    double ld2 = 316.510181796324;
    double ld3 = 149.14731471321085;
    fb1 = ld1 < ld2;
    double ld4 = 748.6314119358728;
    Output.points[1][5] += ld3;
if(fo0 != null){
      ld4 = fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb5 = false;
if(fo1 != null){
      lb5 = fo1.m2(fd0, fd1, ld1, ld2);
}
    ab1 = ab2 || ab3;
    ld3 = ld4 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld1, ld2, ld3);
}
    Thought lo6 = Thought369.getInstance();
    ab4 = !fb0;
    fb1 = lb5 && ab1;
    ld4 = fd0 + fd1;
    Output.points[1][6] += ld1;
    Output.points[1][7] -= ld2;
    ab2 = ld3 > ld4;
    ab3 = fd0 < fd1;
    ab4 = ld1 < ld2;
    ld3 *= -1;
    ld4 *= -1;
    Thought lo7 = Thought89.getInstance(fb0, fb1, lb5, ab1);

Thought.STACK_COUNTER++;
return ab2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    fb0 = fb1 || lb0;
    double ld1 = 340.13536914585933;
    fb0 = ld1 < ad1;
    double ld2 = 754.2721962196675;
    ad1 = ad2 + ad3;
    Output.points[1][8] += ad4;
    fd0 = fd1 + ld1;
    boolean lb3 = true;
    Thought lo4 = Thought385.getInstance(fo0, fo1, fo0, fo1, ld2, ad1, ad2, ad3, fb0, fb1, lb0, lb3);
    fb0 = fb1 && lb0;

Thought.STACK_COUNTER++;
return lb3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
    boolean lb0 = true;
    boolean lb1 = false;
if(fo0 != null){
      fo0.m1(fd0, fd1, ad1, ad2, lb0, lb1, ab1, ab2);
}
    ad3 = ad4 + fd0;
    fd1 = ad1 + ad2;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    boolean lb2 = true;
        ad3 = ad4 - fd0;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m2(fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb1 = lb2 || ab1;
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    ad2 = ad3 - ad4;
    fb1 = !lb0;
    fd0 = fd1 + ad1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, lb1, lb2, ab1, ab2);
}
    fd1 *= -1;
if(fo1 != null){
      fo1.m1(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
    Output.points[2][0] += fd0;

Thought.STACK_COUNTER++;
return lb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
    fb1 = fb0 || fb1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
    fb1 = fd0 > fd1;
    Thought lo0 = Thought335.getInstance(fo1, ao1, ao2, ao3);
    fb0 = fd0 < fd1;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd1 = fd0 - fd1;

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad1 > ad2;
    Output.points[2][1] += ad3;
if(ao1 != null){
      fb1 = ao1.m2(fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    Thought lo1 = Thought185.getInstance(ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
    fb0 = !fb1;
    double ld2 = 967.5951185526305;
    fd0 = fd1 - ld2;
    boolean lb3 = false;
    Thought lo4 = Thought342.getInstance(ao1, ao2, ao3, ao4, lb0, lb3, fb0, fb1);
    lb0 = !lb3;
    fb0 = ad1 > ad2;
    fb1 = ad3 < ad4;
    fd0 = fd1 + ld2;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    double ld5 = 496.2929563840802;
    ld5 *= -1;
        ad1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    boolean lb6 = false;
if(ao1 != null){
      lb0 = ao1.m2(ao2, ao3, ao4, fo0, fd1, ld2, ld5, ad1);
}
    if (lb3) {
if(ao1 != null){
          fo1 = ao1.m4();
}
if(ao2 != null){
          ad2 = ao2.m3(lb6, fb0, fb1, lb0);
}
        boolean lb7 = true;
}
Thought.STACK_COUNTER++;
return lb3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
    fd1 = fd0 - fd1;
    Thought lo0 = Thought342.getInstance(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
    fb1 = ab1 || ab2;
    fd0 = fd1 + fd0;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4);
}
    fd0 = fd1 + fd0;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    lb1 = fd0 < fd1;
    if (ab1) {
        fd0 = fd1 + fd0;
        Output.points[2][2] -= fd1;
        ab2 = !ab3;
        Output.points[2][3] += fd0;
        ab4 = fd1 < fd0;
}
Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
    ab4 = ad2 < ad3;
    if (fb0) {
if(ao3 != null){
          ao2 = ao3.m4();
}
if(fo0 != null){
          ao4 = fo0.m4(fb1, ab1, ab2, ab3);
}
        boolean lb0 = true;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
        Thought lo1 = Thought81.getInstance(ad2, ad3, ad4, fd0, lb0, ab1, ab2, ab3);
        fd1 = ad1 - ad2;
        ad3 = ad4 - fd0;
        Thought lo2 = Thought81.getInstance(fo1, ao1, ao2, ao3, ab4, fb0, fb1, lb0);
if(ao4 != null){
          ab1 = ao4.m2(fo0, fo1, ao1, ao2);
}
        ab2 = fd1 < ad1;
        Thought lo3 = Thought251.getInstance(ad2, ad3, ad4, fd0);
if(ao3 != null){
          fd1 = ao3.m3(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
        Thought lo4 = Thought196.getInstance();
if(ao3 != null){
          ao2 = ao3.m4(ab3, ab4, fb0, fb1);
}
}
Thought.STACK_COUNTER++;
return ab1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    if (fb1) {
        } else {
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
        fd1 = fd0 - fd1;
        fd0 = fd1 + fd0;
if(fo1 != null){
          fb0 = fo1.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 || fb1;
        fd1 = fd0 + fd1;
        fb0 = fb1 || fb0;
        Thought lo0 = Thought187.getInstance(fo0, fo1, fo0, fo1);
        Thought lo1 = Thought34.getInstance(fd0, fd1, fd0, fd1);
}
Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 838.5196447623787;
    ab2 = ab3 && ab4;
    fb0 = fb1 && ab1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
    ab2 = !ab3;
    ab4 = fb0 || fb1;
    ab1 = ab2 && ab3;
    fd1 = ld0 - fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo1 = Thought305.getInstance(ab4, fb0, fb1, ab1);
    fd1 *= -1;
    for(int i0=0; i0<10; i0++){
        ld0 = fd0 - fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
        }
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0, fb1, ab1, ab2, ab3);
}
    for(int i1=0; i1<10; i1++){
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
        ld0 = fd0 - fd1;
        ab2 = ab3 && ab4;
        boolean lb2 = true;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fo0.m1(ld0, fd0, fd1, ld0);
}
        Thought lo3 = Thought298.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
        Output.points[2][4] -= fd1;
}
Thought.STACK_COUNTER++;
return ld0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fb0 = fo1.m2();
}
    ad2 = ad3 - ad4;
    fb1 = fb0 || fb1;
    Thought lo0 = Thought195.getInstance(fb0, fb1, fb0, fb1);
    fd0 *= -1;
    fd1 = ad1 - ad2;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = ad1 > ad2;
if(fo1 != null){
      fb0 = fo1.m2(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Output.points[2][5] -= ad1;
    fb1 = ad2 > ad3;
    fb0 = ad4 > fd0;
    Thought lo1 = Thought349.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    Thought lo2 = Thought175.getInstance(fo0, fo1, fo0, fo1);

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 690.647567957757;
    ab2 = ab3 && ab4;
    double ld1 = 812.3016110924608;
    ld0 = ld1 - ad1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    boolean lb2 = true;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, ld0, ld1, ad1);
}
if(fo1 != null){
      ad2 = fo1.m3();
}
if(fo0 != null){
      ad3 = fo0.m3(ab4, fb0, fb1, lb2);
}
    ad4 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ld1, ad1, ad2, ab1, ab2, ab3, ab4);
}
    double ld3 = 7.181562299258071;
    Thought lo4 = Thought177.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, lb2, ab1);
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = !lb2;
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, ld1, ld3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    Output.points[2][6] += fd0;
    Thought lo5 = Thought341.getInstance();
    Thought lo6 = Thought272.getInstance(ab4, fb0, fb1, lb2);
    ab1 = fd1 < ld0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, ld3, ad1, ad2, ab2, ab3, ab4, fb0);
}

Thought.STACK_COUNTER++;
return ad3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    boolean lb0 = false;
    fb0 = fd1 < fd0;
    boolean lb1 = false;
    fb0 = fb1 && lb0;
    lb1 = fb0 || fb1;
    fd1 *= -1;
    fd0 = fd1 - fd0;
    boolean lb2 = true;
    fd1 *= -1;
    boolean lb3 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb0, lb1, lb2, lb3);
}
    double ld4 = 729.4290134844225;

Thought.STACK_COUNTER++;
return ld4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[2][7] -= ad2;
    fb0 = ad3 < ad4;
    boolean lb0 = false;
    fb0 = fb1 && lb0;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
    fd0 = fd1 + ad1;
if(ao1 != null){
          fb1 = ao1.m2(ad2, ad3, ad4, fd0);
}
    double ld1 = 472.62520011633666;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld1, ad1);
}
    lb0 = fb0 || fb1;
    boolean lb2 = true;
    boolean lb3 = false;
    double ld4 = 762.8379955140595;
if(ao2 != null){
      ao2.m2();
}
    Thought lo5 = Thought47.getInstance(lb0, lb2, lb3, fb0);
    Output.points[2][8] += ad1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, fb1, lb0, lb2, lb3);
}
    fb0 = fd1 > ld1;
        boolean lb6 = false;
    boolean lb7 = true;
    lb7 = ld4 > ad1;
if(ao3 != null){
      fb0 = ao3.m2(ad2, ad3, ad4, fd0, fb1, lb0, lb2, lb3);
}
    lb6 = lb7 || fb0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, lb0, lb2, lb3);
}
    Thought lo8 = Thought381.getInstance(ao4, fo0, fo1, ao1);

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
if(ao4 != null){
      ao4.m1();
}
    fd0 = fd1 + fd0;
    Output.points[3][0] -= fd1;
    double ld1 = 692.863654561462;
if(fo0 != null){
      fo0.m1(ab1, ab2, ab3, ab4);
}
    fb0 = ld1 < fd0;
    double ld2 = 667.433130299408;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, ld1, ld2, fb1, lb0, ab1, ab2);
}
    Thought lo3 = Thought368.getInstance(fd0, fd1, ld1, ld2, ab3, ab4, fb0, fb1);
    Output.points[3][1] += fd0;
    double ld4 = 793.0244378268428;
    fd0 = fd1 - ld1;
    ld2 = ld4 + fd0;
    boolean lb5 = false;
    fd1 *= -1;
    ld1 = ld2 - ld4;
    Output.points[3][2] += fd0;
    lb0 = lb5 && ab1;
    fd1 = ld1 - ld2;
    ld4 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          ld1 = fo0.m3(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
          ao4 = fo0.m4(ld2, ld4, fd0, fd1);
}
}
Thought.STACK_COUNTER++;
return ld1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
if(ao2 != null){
      ao2.m1();
}
    ab2 = ad1 > ad2;
    ad3 = ad4 - fd0;
    ab3 = ab4 && fb0;
if(ao4 != null){
      ao3 = ao4.m4(fb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ad1, ad2, fb0, fb1, ab1, ab2);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
        boolean lb0 = true;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    lb0 = !ab1;
    ab2 = ab3 || ab4;
if(ao1 != null){
      fo1 = ao1.m4(ad3, ad4, fd0, fd1);
}
    ad1 *= -1;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    Output.points[3][3] += fd1;
if(ao1 != null){
      ao1.m2();
}
if(ao2 != null){
      ad1 = ao2.m3(fb1, lb0, ab1, ab2);
}
    Output.points[3][4] += ad2;
    double ld1 = 854.4223913865095;
    ab3 = !ab4;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, fb0, fb1, lb0, ab1);
}

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    Thought lo1 = Thought373.getInstance(fo1, fo0, fo1, fo0);
    double ld2 = 874.8143752098493;
    lb0 = fd0 > fd1;
    Thought lo3 = Thought58.getInstance(ld2, fd0, fd1, ld2);
    fd0 = fd1 - ld2;
    Thought lo4 = Thought99.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld2, fd0);
        fd1 = ld2 + fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld2, fd0, fd1, fb1, lb0, fb0, fb1);
}
    ld2 = fd0 + fd1;
    lb0 = ld2 > fd0;
if(fo1 != null){
      fd1 = fo1.m3(ld2, fd0, fd1, ld2, fb0, fb1, lb0, fb0);
}
    Thought lo5 = Thought229.getInstance(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
    boolean lb6 = true;
    boolean lb7 = false;
    lb0 = fd0 > fd1;
if(fo0 != null){
      ld2 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld2, fd0, fd1);
}
    ld2 = fd0 + fd1;
if(fo0 != null){
      ld2 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld2, fd0);
}
    fd1 = ld2 + fd0;
    lb6 = fd1 > ld2;

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    fd1 = fd0 + fd1;
    lb0 = ab1 && ab2;
    ab3 = ab4 || fb0;
    fd0 *= -1;
    Thought lo1 = Thought204.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, ab1, ab2);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    Output.points[3][5] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    lb0 = fd0 > fd1;
    ab1 = !ab2;
    double ld2 = 547.8016034157862;
if(fo1 != null){
      fo0 = fo1.m4(ld2, fd0, fd1, ld2, ab3, ab4, fb0, fb1);
}
    fd0 = fd1 - ld2;
    fd0 *= -1;
    fd1 = ld2 + fd0;
    Output.points[3][6] -= fd1;

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad1 < ad2;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 && fb1;
        Thought lo0 = Thought373.getInstance(fo0, fo1, fo0, fo1);
        fb0 = fb1 || fb0;
        if (fb1) {
if(fo0 != null){
              fo0.m1(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
            boolean lb1 = true;
            lb1 = fb0 && fb1;
            lb1 = !fb0;
if(fo1 != null){
              fd0 = fo1.m3();
}
if(fo0 != null){
              fd1 = fo0.m3(fb1, lb1, fb0, fb1);
}
}}
Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
    ab4 = fb0 && fb1;
    double ld0 = 460.06168887272634;
    ab1 = ld0 > ad1;
    ab2 = ad2 > ad3;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0);
}
    Output.points[3][7] -= ad1;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab2 = ab3 && ab4;
    Output.points[3][8] += ad2;
    ad3 = ad4 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb1, ab1);
}
    boolean lb2 = true;
    Thought lo3 = Thought377.getInstance(fo0, fo1, fo0, fo1, fd1, ld0, ad1, ad2, ab1, ab2, ab3, ab4);
    boolean lb4 = false;

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fb0 = ao2.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    double ld0 = 347.1088360528177;
    double ld1 = 220.43937934104605;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    boolean lb2 = true;
    ld1 = fd0 + fd1;
    Thought lo3 = Thought291.getInstance(ld0, ld1, fd0, fd1);
if(ao2 != null){
      ld0 = ao2.m3(ao3, ao4, fo0, fo1, ld1, fd0, fd1, ld0);
}
    ld1 = fd0 - fd1;

Thought.STACK_COUNTER++;
return ao1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
    Output.points[4][0] += ad1;
    Thought lo0 = Thought255.getInstance();
    ad2 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(ao4 != null){
      ad1 = ao4.m3(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < ad1;
    for(int i0=0; i0<10; i0++){
        ad2 = ad3 - ad4;
if(fo0 != null){
          fb0 = fo0.m2(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
        double ld1 = 717.8657414960387;
        Thought lo2 = Thought103.getInstance(ao4, fo0, fo1, ao1);
if(ao2 != null){
          ad4 = ao2.m3(fd0, fd1, ld1, ad1);
}
if(ao3 != null){
          ad2 = ao3.m3(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
if(ao2 != null){
          ld1 = ao2.m3();
}
        Output.points[4][1] += ad1;
        Output.points[4][2] -= ad2;
if(ao3 != null){
          fb1 = ao3.m2(fb0, fb1, fb0, fb1);
}
        ad3 = ad4 + fd0;
        fd1 = ld1 + ad1;
        fb0 = !fb1;
}
Thought.STACK_COUNTER++;
return ao4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    boolean lb0 = false;
    fd0 *= -1;
if(ao2 != null){
      ab3 = ao2.m2(ao3, ao4, fo0, fo1, ab4, fb0, fb1, lb0);
}
    ab1 = !ab2;
    fd1 = fd0 + fd1;
    ab3 = fd0 > fd1;
    ab4 = fd0 < fd1;
    fd0 *= -1;

Thought.STACK_COUNTER++;
return ao1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1);
}
    ab2 = ad3 > ad4;
    Thought lo0 = Thought8.getInstance(fd0, fd1, ad1, ad2);
    ab3 = ab4 && fb0;
    Thought lo1 = Thought247.getInstance(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
    fb1 = ab1 || ab2;
    ab3 = ab4 || fb0;
if(fo0 != null){
      fo0.m3();
}
    if (fb1) {
        Output.points[4][3] -= ad1;
        ad2 = ad3 - ad4;
if(ao1 != null){
          fo1 = ao1.m4(ab1, ab2, ab3, ab4);
}
if(ao2 != null){
          fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
}
        } else {
        ad4 = fd0 - fd1;
        boolean lb2 = true;
        ab2 = ab3 || ab4;
        Thought lo3 = Thought289.getInstance(ad1, ad2, ad3, ad4, fb0, fb1, lb2, ab1);
if(ao1 != null){
          fd0 = ao1.m3(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
          fo1.m2(ao1, ao2, ao3, ao4);
}
        fb1 = lb2 || ab1;
if(fo1 != null){
          fo0 = fo1.m4(fd1, ad1, ad2, ad3);
}
        ad4 *= -1;
if(ao1 != null){
          ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
}
if(ao1 != null){
          fo1 = ao1.m4();
}
if(ao3 != null){
          ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
        fb1 = ad3 > ad4;
}
Thought.STACK_COUNTER++;
return ao4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
void accept(String color) throws CountDownExc {
switch (color) {
case "e":
empty();
break;
case "own":
own();
break;
case "other":
other();
break;
default:
throw new RuntimeException("Illegal color!!!");
}
}
void empty() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
    Output.points[4][4] += fd1;
    boolean lb0 = true;
if(fo1 != null){
          fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
            boolean lb1 = false;
    fb0 = fb1 || lb0;
    Output.points[4][5] += fd1;
    lb1 = fb0 && fb1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    Thought lo0 = Thought172.getInstance(fo1, fo0, fo1, fo0);
    Thought lo1 = Thought362.getInstance(fd1, fd0, fd1, fd0);
    fd1 *= -1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo2 = Thought256.getInstance(fb0, fb1, fb0, fb1);
    Thought lo3 = Thought373.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb4 = false;
if(fo0 != null){
      lb4 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb4, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    lb4 = fb0 || fb1;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
        lb4 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo5 = Thought139.getInstance(lb4, fb0, fb1, lb4);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, lb4, fb0, fb1);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd1 > fd0;
    fb1 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
    fb0 = fb1 || fb0;
        fd0 = fd1 - fd0;
    Output.points[4][6] -= fd1;
    boolean lb0 = false;
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    fb1 = fd1 > fd0;
    lb0 = fb0 || fb1;
    lb0 = fd1 > fd0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd1 *= -1;
    fd0 *= -1;
        fb1 = lb0 || fb0;
    double ld1 = 296.33356053209377;
    fb1 = !lb0;
    fb0 = fb1 || lb0;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, fb0);
}
    fb1 = !lb0;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
}
