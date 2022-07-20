package genetic;
import java.util.ArrayList;
class Thought359 extends Thought{
private static ArrayList<Thought359> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 926.0510821565643;
private double fd1 = 544.7336572218359;
private Thought fo0 = null;
private Thought fo1 = null;
Thought359 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought359 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought359 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought359 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought359 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought359 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought359 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought359 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought359 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought359 instance = new Thought359 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought359 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought359 instance = new Thought359 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought359 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought359 instance = new Thought359 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought359 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought359 instance = new Thought359 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought359 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought359 instance = new Thought359 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought359 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought359 instance = new Thought359 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought359 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought359 instance = new Thought359 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought359 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought359 instance = new Thought359 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd0 *= -1;
    fb0 = fd1 > fd0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    if (fb1) {
        fd1 = fd0 - fd1;
if(fo0 != null){
          fo0.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
        boolean lb0 = false;
        lb0 = !fb0;
        fd0 *= -1;
        fb1 = !lb0;
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
    ab2 = !ab3;
    boolean lb0 = false;
    fd1 = fd0 + fd1;
    ab3 = ab4 && fb0;
    fd0 *= -1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    fb1 = lb0 && ab1;
    ab2 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
        ab3 = ab4 || fb0;
    Output.points[5][2] -= fd1;
    fd0 *= -1;

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
    fb0 = ad2 < ad3;
    fb1 = ad4 < fd0;
    fd1 *= -1;
        double ld0 = 293.8884461622556;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3);
}
    boolean lb1 = false;
    ad4 = fd0 + fd1;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m1(lb1, lb2, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          ld0 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, lb1, lb2, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld0, ad1, lb1, lb2, fb0, fb1);
}
        lb1 = lb2 || fb0;
        ad2 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb1, lb2, fb0);
}
        fb1 = lb1 || lb2;
        Thought lo3 = Thought395.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
          fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
        double ld4 = 791.6096764971279;
        fb0 = fb1 || lb1;
if(fo0 != null){
          lb2 = fo0.m2(fo1, fo0, fo1, fo0, ld4, ld0, ad1, ad2);
}
        ad3 = ad4 - fd0;
if(fo1 != null){
          fo1.m1();
}
        fd1 *= -1;
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
    ab1 = ad1 < ad2;
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    ad3 *= -1;
    double ld0 = 8.647210488553165;
    ad3 = ad4 - fd0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    Output.points[5][3] += ad1;
    double ld1 = 549.4144687510616;
if(fo0 != null){
              ad1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    ab1 = ad2 > ad3;
    double ld2 = 836.6857165138626;
    boolean lb3 = false;
    boolean lb4 = true;
    lb4 = ab1 || ab2;
    boolean lb5 = true;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld0, ld1, ld2, ad1);
}
    Thought lo6 = Thought338.getInstance();
    boolean lb7 = true;
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
    double ld0 = 275.94508498509936;
    fd0 = fd1 - ld0;
        fb0 = !fb1;
    fb0 = !fb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
    fb0 = ld0 > fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    double ld1 = 860.2380491574507;
    boolean lb2 = false;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ld0, ld1);
}
            fb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld0, ld1, fd0, fd1);
}
    ld0 = ld1 + fd0;
    fb1 = lb2 || fb0;
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd1 *= -1;
if(ao1 != null){
      ld0 = ao1.m3(fb0, fb1, lb2, lb3);
}
    Thought lo4 = Thought55.getInstance(ao2, ao3, ao4, fo0, ld1, fd0, fd1, ld0, fb0, fb1, lb2, lb3);
    if (fb0) {
        boolean lb5 = true;
        ld1 *= -1;
if(fo1 != null){
          fo1.m3(fd0, fd1, ld0, ld1, fb0, fb1, lb5, lb2);
}
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad1 > ad2;
    boolean lb0 = false;
    ad3 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 || fb0;
    ad4 = fd0 + fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fb1 = lb0 || fb0;
    fb1 = ad1 < ad2;
    ad3 *= -1;
    if (lb0) {
        if (fb0) {
            fb1 = lb0 || fb0;
            boolean lb1 = false;
            Thought lo2 = Thought388.getInstance(ad4, fd0, fd1, ad1);
}}
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
    ab1 = ab2 && ab3;
    fd1 *= -1;
    if (ab4) {
if(ao1 != null){
          fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
        fd1 = fd0 - fd1;
        Thought lo0 = Thought183.getInstance();
if(fo1 != null){
          fo1.m1(fb0, fb1, ab1, ab2);
}
        ab3 = fd0 > fd1;
        fd0 *= -1;
        fd1 *= -1;
if(ao1 != null){
          ab4 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
        Thought lo1 = Thought3.getInstance(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
        ab1 = fd0 < fd1;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    double ld0 = 3.7257014289960995;
    boolean lb1 = true;
    double ld2 = 613.9287769008127;
    boolean lb3 = true;
    ab4 = fb0 || fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ld0 = ld2 + ad1;
    lb1 = lb3 && ab1;
    if (ab2) {
        ad2 = ad3 + ad4;
        ab3 = ab4 && fb0;
if(ao3 != null){
          ao2 = ao3.m4(fd0, fd1, ld0, ld2);
}
        boolean lb4 = false;
        fb0 = ad1 < ad2;
        ad3 = ad4 + fd0;
if(ao4 != null){
          ao4.m1(fo0, fo1, ao1, ao2, fd1, ld0, ld2, ad1);
}
if(ao3 != null){
          fb1 = ao3.m2();
}
        lb4 = ad2 > ad3;
if(fo0 != null){
          ao4 = fo0.m4(lb1, lb3, ab1, ab2);
}
        ab3 = !ab4;
        ad4 = fd0 - fd1;
        ld0 *= -1;
if(fo1 != null){
          fo1.m2(ao1, ao2, ao3, ao4, ld2, ad1, ad2, ad3, fb0, fb1, lb4, lb1);
}
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
    if (fb0) {
        Output.points[5][4] -= fd1;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
        fd0 = fd1 - fd0;
        double ld0 = 972.5582714845091;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 || fb1;
        fb0 = fb1 || fb0;
        Output.points[5][5] -= fd0;
        fb1 = fb0 && fb1;
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
        Output.points[5][6] += fd1;
if(fo0 != null){
          fo1 = fo0.m4(ld0, fd0, fd1, ld0);
}
        if (fb1) {
            boolean lb1 = false;
            fd0 *= -1;
            Output.points[5][7] += fd1;
if(fo1 != null){
              fo1.m2(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
if(fo0 != null){
              lb1 = fo0.m2();
}
            fd0 *= -1;
            fb0 = fb1 && lb1;
            fd1 *= -1;
            fb0 = ld0 < fd0;
}}
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
    fd0 = fd1 - fd0;
    boolean lb0 = true;
    ab1 = ab2 || ab3;
if(fo1 != null){
      ab4 = fo1.m2(fb0, fb1, lb0, ab1);
}
    double ld1 = 322.26452052028606;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = lb0 || ab1;
    ab2 = fd1 < ld1;
    double ld2 = 97.92992232566681;
    ab3 = ab4 || fb0;
    ld2 = fd0 + fd1;
    Thought lo3 = Thought94.getInstance(ld1, ld2, fd0, fd1, fb1, lb0, ab1, ab2);
    ld1 = ld2 + fd0;
    ab3 = ab4 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, ab1, ab2);
}
    Thought lo4 = Thought47.getInstance(fo1, fo0, fo1, fo0);
    Thought lo5 = Thought89.getInstance(fd1, ld1, ld2, fd0);
    Output.points[5][8] -= fd1;
    ab3 = ld1 < ld2;

Thought.STACK_COUNTER++;
return ab4;
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
    fb1 = ad1 < ad2;
    ad3 = ad4 - fd0;
    Thought lo0 = Thought288.getInstance(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
    ad4 = fd0 + fd1;
    Thought lo1 = Thought279.getInstance();
    Output.points[6][0] -= ad1;
    Output.points[6][1] -= ad2;
    double ld2 = 197.28328658124775;
    double ld3 = 571.4205777504358;
    fb0 = !fb1;
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, ld2, ld3, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    ad1 = ad2 - ad3;
if(fo0 != null){
      fb1 = fo0.m2(ad4, fd0, fd1, ld2);
}
    fb0 = ld3 < ad1;
    fb1 = ad2 > ad3;
    Thought lo4 = Thought250.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld2);
    fb0 = fb1 || fb0;
    ld3 = ad1 + ad2;
if(fo1 != null){
      ad3 = fo1.m3();
}
    fb1 = ad4 < fd0;

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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo0.m1(fb0, fb1, ab1, ab2);
}
    ad2 *= -1;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
    Thought lo0 = Thought245.getInstance(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
    fb0 = !fb1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
    boolean lb0 = false;
    boolean lb1 = false;
    fd1 *= -1;
    boolean lb2 = false;
    lb1 = !lb2;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3();
}
if(ao2 != null){
      ao1 = ao2.m4(fb1, lb0, lb1, lb2);
}
    Thought lo3 = Thought227.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
    fd1 = fd0 - fd1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, lb2, fb0, fb1, lb0);
}
    lb1 = fd0 < fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb2, fb0, fb1, lb0);
}
if(ao3 != null){
      lb1 = ao3.m2(ao4, fo0, fo1, ao1);
}
    lb2 = !fb0;
    double ld4 = 419.5327866259626;
if(ao3 != null){
      ao2 = ao3.m4(ld4, fd0, fd1, ld4);
}
    boolean lb5 = true;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, ld4, fd0, fd1);
}
if(ao3 != null){
      fb0 = ao3.m2();
}
    fb1 = ld4 < fd0;
    lb0 = fd1 < ld4;
    fd0 *= -1;
    Output.points[6][2] += fd1;
    boolean lb6 = false;

Thought.STACK_COUNTER++;
return lb1;
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
    Thought lo0 = Thought306.getInstance(fb0, fb1, fb0, fb1);
    Output.points[6][3] += ad1;
    Thought lo1 = Thought6.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
    fd1 *= -1;
if(fo1 != null){
      fo1.m1(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    fd1 = ad1 - ad2;
    ad3 *= -1;
    Thought lo2 = Thought334.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
    double ld3 = 503.44713311809096;
    Thought lo4 = Thought128.getInstance(fo0, fo1, ao1, ao2);
if(ao4 != null){
      ao3 = ao4.m4(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld3, ad1, ad2, ad3);
}
    Output.points[6][4] += ad4;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fd0 < fd1;
    fb1 = fb0 || fb1;
    fb0 = fb1 || fb0;
    ld3 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
    boolean lb5 = true;
    double ld6 = 594.0207128897491;
    double ld7 = 244.02495927349818;
    ld6 = ld7 + ad1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 < fd1;
    fb1 = fd0 > fd1;
    boolean lb0 = false;
    Thought lo1 = Thought140.getInstance(fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab4, fb0, fb1, lb0);
}
    ab1 = fd0 < fd1;
    ab2 = ab3 && ab4;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
        fd0 *= -1;
    fd1 *= -1;
    fb0 = fd0 > fd1;
    fd0 = fd1 - fd0;
    fb1 = !lb0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    ab1 = fd1 > fd0;
    ab2 = fd1 > fd0;
    boolean lb2 = false;
    fd1 = fd0 + fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    ab2 = !ab3;
    ab4 = fd0 > fd1;
    boolean lb3 = true;
    ab4 = fd0 > fd1;
    double ld4 = 691.8479660196082;
    boolean lb5 = true;

Thought.STACK_COUNTER++;
return ab4;
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
    ad1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    ad2 = ad3 + ad4;
    boolean lb0 = false;
    lb0 = ab1 || ab2;
if(ao4 != null){
      ao3 = ao4.m4(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3, lb0, ab1, ab2, ab3);
}
if(fo0 != null){
      ao4 = fo0.m4(ad4, fd0, fd1, ad1, ab4, fb0, fb1, lb0);
}
    if (ab1) {
        ab2 = ad2 < ad3;
        Thought lo1 = Thought133.getInstance(fo1, ao1, ao2, ao3, ab3, ab4, fb0, fb1);
        lb0 = ab1 && ab2;
}
Thought.STACK_COUNTER++;
return ab3;
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
    fd1 = fd0 - fd1;
    Output.points[6][5] -= fd0;
    boolean lb0 = false;
    lb0 = fd1 > fd0;
    Thought lo1 = Thought291.getInstance(fo1, fo0, fo1, fo0);
    fb0 = fb1 || lb0;
    double ld2 = 947.5279085887465;
if(fo1 != null){
      fo1.m3(fd0, fd1, ld2, fd0);
}
    double ld3 = 228.18340636847108;
    Thought lo4 = Thought13.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld2, ld3);
    double ld5 = 668.7114759347262;
    ld5 = fd0 + fd1;
    Output.points[6][6] -= ld2;
    fb0 = !fb1;
    Output.points[6][7] += ld3;
    ld5 = fd0 - fd1;
if(fo0 != null){
      ld2 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(lb0, fb0, fb1, lb0);
}
    Output.points[6][8] -= ld3;
    double ld6 = 259.79547519315076;
    ld5 = ld6 - fd0;
    fb0 = fd1 > ld2;
    fb1 = !lb0;
    fb0 = fb1 || lb0;
    boolean lb7 = true;

Thought.STACK_COUNTER++;
return ld3;
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
    ab2 = !ab3;
    Output.points[7][0] += fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
    ab2 = !ab3;
    boolean lb0 = false;
    Output.points[7][1] -= fd1;
    ab3 = !ab4;
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, fd0, fd1, fb1, lb0, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        fd0 *= -1;
        boolean lb1 = false;
        lb1 = lb0 || ab1;
        fd1 = fd0 - fd1;
        ab2 = !ab3;
        ab4 = fd0 < fd1;
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
    double ld0 = 629.3044161913517;
    ad4 = fd0 + fd1;
    ld0 = ad1 - ad2;
        Thought lo1 = Thought318.getInstance(fo0, fo1, fo0, fo1);
    ad3 = ad4 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, ad1, ad2);
}
    double ld2 = 597.8500471075054;
    Output.points[7][2] += ad2;
    fb0 = fb1 || fb0;
    ad3 *= -1;
    Thought lo3 = Thought95.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0);
if(fo0 != null){
      fo0.m1();
}
    ld2 *= -1;

Thought.STACK_COUNTER++;
return ad1;
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
    Output.points[7][3] -= ad2;
if(fo1 != null){
      ad3 = fo1.m3(ab2, ab3, ab4, fb0);
}
    fb1 = ad4 < fd0;
    ab1 = ab2 || ab3;
    Output.points[7][4] -= fd1;
    ad1 *= -1;
    Thought lo0 = Thought101.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
    Output.points[7][5] -= fd1;
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
    boolean lb1 = false;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb1, ab1);
}
    ad3 = ad4 + fd0;
    fd1 = ad1 + ad2;
    ad3 *= -1;
    ad4 *= -1;
    double ld2 = 510.1164359756971;
    boolean lb3 = false;
    Output.points[7][6] -= ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld2, ad1, ad2);
}
    boolean lb4 = false;
    ad3 = ad4 - fd0;
    Output.points[7][7] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld2, ad1, ad2, ad3);
}

Thought.STACK_COUNTER++;
return ad4;
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
    fb0 = fd1 < fd0;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fb1 = fd1 > fd0;
    boolean lb0 = false;
    fd1 *= -1;
    lb0 = fb0 || fb1;
    lb0 = fd0 > fd1;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, lb0, fb0);
}
    double ld1 = 125.0854995563943;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld1, fd0, fd1, ld1, fb1, lb0, fb0, fb1);
}
    lb0 = fd0 > fd1;
    if (fb0) {
        ld1 *= -1;
if(fo0 != null){
          fo0.m1(fd0, fd1, ld1, fd0, fb1, lb0, fb0, fb1);
}
        Output.points[7][8] -= fd1;
        Thought lo2 = Thought345.getInstance(fo1, ao1, ao2, ao3, lb0, fb0, fb1, lb0);
if(ao4 != null){
          ao4.m1(fo0, fo1, ao1, ao2);
}
        ld1 *= -1;
        double ld3 = 370.37186836438366;
        fb0 = ld1 < fd0;
if(ao4 != null){
          ao3 = ao4.m4(fd1, ld3, ld1, fd0);
}
        fb1 = fd1 < ld3;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld1, fd0, fd1, ld3);
}
        boolean lb4 = true;
        Output.points[8][0] += ld1;
        Output.points[8][1] -= fd0;
if(fo1 != null){
          fo0 = fo1.m4();
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
if(ao1 != null){
      fb0 = ao1.m2(fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + ad1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(ao1 != null){
      fd1 = ao1.m3(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    Output.points[8][2] -= fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    fd1 = ad1 - ad2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ad3 = ad4 + fd0;

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
if(ao2 != null){
      fd0 = ao2.m3(fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ab2 = ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    ab3 = fd1 < fd0;
    fd1 *= -1;
if(ao2 != null){
      fd0 = ao2.m3();
}
if(ao3 != null){
      ao3.m3(ab4, fb0, fb1, ab1);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 < fd0;
    fd1 = fd0 + fd1;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fd0 *= -1;
    boolean lb0 = false;
    ab4 = !fb0;
    fb1 = fd1 > fd0;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, lb0, ab1, ab2, ab3);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    ab4 = fb0 && fb1;
    lb0 = fd1 < fd0;
    double ld1 = 749.6979202961016;
    boolean lb2 = false;
    fd0 = fd1 + ld1;
    lb2 = ab1 || ab2;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ld1, fd0);
}
    fd1 = ld1 + fd0;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
    Thought lo0 = Thought37.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
        ab3 = fd0 < fd1;
    double ld1 = 397.4175505894148;
    ab4 = ld1 > ad1;
    Output.points[8][3] -= ad2;
    ad3 = ad4 - fd0;
    fd1 *= -1;
    ld1 = ad1 + ad2;
if(fo1 != null){
      ad3 = fo1.m3();
}
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, ab1, ab2);
}
    double ld2 = 25.77887093329821;
        boolean lb3 = true;
        ab2 = ab3 || ab4;
    fb0 = ad3 > ad4;
        boolean lb4 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld1, ld2, fb0, fb1, lb3, lb4);
}
    Thought lo5 = Thought266.getInstance(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
    boolean lb6 = true;
    double ld7 = 871.5828280281297;
    ab4 = fb0 || fb1;
        ad4 *= -1;
if(ao3 != null){
      lb3 = ao3.m2(ao4, fo0, fo1, ao1, lb4, lb6, ab1, ab2);
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    fb1 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb1 = fd0 > fd1;
if(fo1 != null){
      fd0 = fo1.m3();
}
    double ld0 = 154.54918768586995;
    fd0 = fd1 - ld0;
    fd0 *= -1;
    boolean lb1 = true;
    double ld2 = 422.9226175757288;
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(lb1, lb3, fb0, fb1);
}
    boolean lb4 = false;
    double ld5 = 379.8458663735708;

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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    ab3 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
    fd1 = fd0 - fd1;
    if (ab2) {
        Thought lo0 = Thought350.getInstance(fo0, fo1, fo0, fo1);
        boolean lb1 = false;
        Thought lo2 = Thought371.getInstance(fd0, fd1, fd0, fd1);
        fd0 = fd1 + fd0;
        Thought lo3 = Thought302.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
        fd1 = fd0 - fd1;
if(fo0 != null){
          fo0.m3();
}
        boolean lb4 = true;
        ab1 = !ab2;
        ab3 = fd0 < fd1;
        Thought lo5 = Thought280.getInstance(ab4, fb0, fb1, lb1);
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb4, ab1, ab2, ab3);
}
        fd0 = fd1 - fd0;
        fd1 = fd0 + fd1;
if(fo0 != null){
          fd0 = fo0.m3(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb1);
}
        lb4 = fd1 < fd0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
}
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    double ld1 = 727.4094540275017;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    lb0 = ad1 > ad2;
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ld1);
}
    ad1 *= -1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    double ld2 = 585.398914573356;
    double ld3 = 271.2491481603046;
    Thought lo4 = Thought37.getInstance();
    boolean lb5 = true;
    Thought lo6 = Thought150.getInstance(lb5, fb0, fb1, lb0);
    double ld7 = 659.2700067982151;
if(fo0 != null){
      lb5 = fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, lb0, lb5);
}
    double ld8 = 498.6882252483597;
if(fo1 != null){
      fb0 = fo1.m2(ld1, ld2, ld3, ld7, fb1, lb0, lb5, fb0);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, lb5, fb0);
}
        ld8 = ad1 - ad2;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        fb1 = !lb0;
        lb5 = fb0 && fb1;
        ad3 = ad4 - fd0;
        Output.points[8][4] -= fd1;
        Output.points[8][5] += ld1;
        lb0 = lb5 || fb0;
        double ld9 = 965.6860920248157;
        for(int i1=0; i1<10; i1++){
            Output.points[8][6] += ld1;
}}
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
    Output.points[8][7] -= ad4;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
    ab2 = ab3 || ab4;
    fb0 = fb1 || ab1;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    ad2 = ad3 - ad4;
    Output.points[8][8] -= fd0;
    fd1 = ad1 + ad2;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab2 = ad3 > ad4;
    ab3 = fd0 < fd1;
    boolean lb0 = true;
if(fo0 != null){
      fo0.m3(ab3, ab4, fb0, fb1);
}
    Thought lo1 = Thought206.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, lb0, ab1, ab2, ab3);
if(fo1 != null){
      fd0 = fo1.m3(fd1, ad1, ad2, ad3, ab4, fb0, fb1, lb0);
}
    Thought lo2 = Thought77.getInstance(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
    Thought lo3 = Thought213.getInstance(fo0, fo1, fo0, fo1);
    Thought lo4 = Thought20.getInstance(ad4, fd0, fd1, ad1);
    fb0 = fb1 && lb0;
    ab1 = ad2 < ad3;
    ad4 *= -1;
    ab2 = ab3 || ab4;
    boolean lb5 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      ad3 = fo0.m3();
}

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
        fd1 = fd0 + fd1;
if(ao2 != null){
          ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
        fb1 = fb0 && fb1;
        boolean lb0 = false;
        fd0 = fd1 + fd0;
if(ao3 != null){
          fd1 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
        fd0 = fd1 + fd0;
        boolean lb1 = true;
        double ld2 = 56.14410123223926;
        fd0 = fd1 - ld2;
if(ao3 != null){
          ao2 = ao3.m4(fd0, fd1, ld2, fd0, lb1, fb0, fb1, lb0);
}
        lb1 = fd1 > ld2;
        Output.points[0][0] -= fd0;
        double ld3 = 632.5195446337054;
        fd0 *= -1;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, lb0, lb1);
}
if(ao4 != null){
          fd1 = ao4.m3(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
          ao3 = ao4.m4(ld2, ld3, fd0, fd1);
}
        double ld4 = 817.1376488489072;
        Thought lo5 = Thought139.getInstance(fo0, fo1, ao1, ao2, ld2, ld3, ld4, fd0);
        fd1 = ld2 + ld3;
}
Thought.STACK_COUNTER++;
return ao3;
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
    ad1 = ad2 - ad3;
    fb0 = ad4 < fd0;
    fb1 = fb0 && fb1;
if(ao2 != null){
      ao2.m3();
}
    for(int i0=0; i0<10; i0++){
        Output.points[0][1] += fd1;
        boolean lb0 = true;
if(ao4 != null){
          ao3 = ao4.m4(lb0, fb0, fb1, lb0);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
}
        fd0 = fd1 - ad1;
        double ld1 = 332.12144805265;
if(fo0 != null){
          fb1 = fo0.m2(ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);
}
        fd0 = fd1 + ld1;
        }
    Thought lo2 = Thought147.getInstance(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
    for(int i1=0; i1<10; i1++){
        Thought lo3 = Thought10.getInstance(ao4, fo0, fo1, ao1);
if(ao2 != null){
          fb1 = ao2.m2(ad2, ad3, ad4, fd0);
}
        boolean lb4 = false;
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
if(ao3 != null){
          ao2 = ao3.m4();
}
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
    ab1 = fd1 < fd0;
    ab2 = ab3 || ab4;
if(ao1 != null){
      fb0 = ao1.m2(fb1, ab1, ab2, ab3);
}
    ab4 = fd1 > fd0;
    fb0 = fd1 < fd0;
    fb1 = fd1 < fd0;
    ab1 = fd1 > fd0;
    Thought lo0 = Thought168.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    ab1 = ab2 || ab3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab4, fb0, fb1, ab1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    if (ab2) {
}
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
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0);
}
    ab1 = !ab2;
    ab3 = !ab4;
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    ad4 *= -1;
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, ab1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
    ad3 = ad4 + fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, ad1, ad2, ad3, fb1, lb0, ab1, ab2);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
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
    fb0 = fd1 < fd0;
    fb1 = fd1 > fd0;
    fd1 = fd0 - fd1;
    fd0 *= -1;
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo1 = Thought392.getInstance(lb0, fb0, fb1, lb0);
    Thought lo2 = Thought333.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    lb0 = fd1 < fd0;
    fd1 = fd0 - fd1;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
        fb1 = fd1 > fd0;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    double ld3 = 128.46626264341324;
    Output.points[0][2] -= fd0;
    fd1 *= -1;
    double ld4 = 636.4208860826435;
    fb0 = ld3 > ld4;
    Output.points[0][3] -= fd0;
    fd1 = ld3 + ld4;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld3, ld4, fd0);
}
    fd1 = ld3 + ld4;
    double ld5 = 44.37999940905949;
    fb1 = lb0 || fb0;
    Thought lo6 = Thought80.getInstance(fo0, fo1, fo0, fo1, ld5, fd0, fd1, ld3);

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
    fb0 = !fb1;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    fd1 = fd0 + fd1;
    Thought lo1 = Thought294.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
    fb1 = fd0 < fd1;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    Thought lo2 = Thought279.getInstance(fd0, fd1, fd0, fd1);

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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb1 = !fb0;
    fd0 *= -1;
    fd1 *= -1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo0.m1();
}
    Output.points[0][4] += fd1;
    Thought lo0 = Thought365.getInstance(fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
    Output.points[0][5] -= fd1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    double ld1 = 320.4921461997293;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    boolean lb2 = true;

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
