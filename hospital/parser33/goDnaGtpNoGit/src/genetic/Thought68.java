package genetic;
import java.util.ArrayList;
class Thought68 extends Thought{
private static ArrayList<Thought68> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 147.8870092593792;
private double fd1 = 468.0869636221016;
private Thought fo0 = null;
private Thought fo1 = null;
Thought68 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought68 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought68 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought68 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought68 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought68 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought68 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought68 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought68 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought68 instance = new Thought68 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought68 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought68 instance = new Thought68 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought68 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought68 instance = new Thought68 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought68 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought68 instance = new Thought68 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought68 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought68 instance = new Thought68 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought68 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought68 instance = new Thought68 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought68 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought68 instance = new Thought68 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought68 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought68 instance = new Thought68 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd1 = fd0 + fd1;
    fb0 = fb1 && fb0;
    fd0 *= -1;
    boolean lb0 = false;
    double ld1 = 114.67785409456269;
    boolean lb2 = false;
    Thought lo3 = Thought321.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, lb2, fb0, fb1, lb0);
    fd1 *= -1;
    lb2 = !fb0;
    ld1 = fd0 + fd1;
    fb1 = lb0 || lb2;
    ld1 *= -1;
if(fo0 != null){
      fo0.m3(fd0, fd1, ld1, fd0, fb0, fb1, lb0, lb2);
}
    Thought lo4 = Thought242.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb2);
    boolean lb5 = false;
if(fo1 != null){
      lb5 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fb0 = fd1 < ld1;
    fb1 = lb0 || lb2;
    lb5 = !fb0;
    double ld6 = 403.34320793121617;
    fb1 = !lb0;
if(fo1 != null){
      fo0 = fo1.m4(ld6, fd0, fd1, ld1);
}
    Output.points[4][8] += ld6;
    boolean lb7 = true;
    fd0 = fd1 - ld1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ld6, fd0, fd1, ld1);
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
    fd1 = fd0 + fd1;
    double ld0 = 874.7834201004174;
if(fo1 != null){
      ab2 = fo1.m2();
}
    ab3 = ab4 || fb0;
if(fo0 != null){
      fb1 = fo0.m2(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0, ab4, fb0, fb1, ab1);
}
    ab2 = fd1 < ld0;
    ab3 = fd0 < fd1;
    ld0 = fd0 - fd1;
    ld0 = fd0 + fd1;
    Thought lo1 = Thought391.getInstance(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
    fb1 = fb0 || fb1;
    fb0 = ad4 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3);
}
    fb1 = fb0 || fb1;
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      fo1.m3();
}
    fb1 = fb0 || fb1;
    boolean lb0 = true;
    Thought lo1 = Thought328.getInstance(lb0, fb0, fb1, lb0);
    Thought lo2 = Thought308.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
    fd1 = ad1 + ad2;
    fb1 = ad3 > ad4;

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
    ab1 = ab2 || ab3;
    Output.points[5][0] += ad1;
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1, ab4, fb0, fb1, ab1);
}
    ad1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    ab1 = ad2 < ad3;
    double ld0 = 54.10743664202329;
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ld0);
}
    ad1 = ad2 + ad3;
    Output.points[5][1] -= ad4;
    ab2 = fd0 > fd1;
    Output.points[5][2] += ld0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    boolean lb1 = false;
    Thought lo2 = Thought52.getInstance();
if(fo0 != null){
      fo0.m1(ab2, ab3, ab4, fb0);
}
    fb1 = !lb1;

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
    fd1 *= -1;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought245.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    Thought lo1 = Thought6.getInstance(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4);
}
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    boolean lb2 = true;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
        fd1 = fd0 + fd1;
    Thought lo3 = Thought290.getInstance();

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
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    Output.points[5][3] += ad1;
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    double ld0 = 155.7886929150756;
    boolean lb1 = true;
    Thought lo2 = Thought116.getInstance(fd0, fd1, ld0, ad1, fb0, fb1, lb1, fb0);
    fb1 = !lb1;
    fb0 = ad2 < ad3;
    ad4 = fd0 + fd1;
    Thought lo3 = Thought11.getInstance(ao3, ao4, fo0, fo1, fb1, lb1, fb0, fb1);

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
    Output.points[5][4] -= fd0;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      ab1 = fo1.m2(fd1, fd0, fd1, fd0);
}
    ab2 = ab3 || ab4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    fb0 = fb1 && ab1;
    if (ab2) {
        fd0 = fd1 + fd0;
        Thought lo0 = Thought196.getInstance();
if(ao2 != null){
          ao1 = ao2.m4(ab3, ab4, fb0, fb1);
}
        fd1 = fd0 + fd1;
        Output.points[5][5] += fd0;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(ao4 != null){
          ao3 = ao4.m4(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
        Thought lo1 = Thought85.getInstance(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
        fd1 *= -1;
        boolean lb2 = true;
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
    ad1 *= -1;
    Thought lo0 = Thought360.getInstance(ad2, ad3, ad4, fd0);
    Output.points[5][6] += fd1;
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
    double ld1 = 655.014635754865;
if(fo1 != null){
      fd0 = fo1.m3();
}
    ab1 = !ab2;
if(ao2 != null){
      ao1 = ao2.m4(ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld1, ad1, ad2, ab1, ab2, ab3, ab4);
}
    boolean lb2 = false;
    double ld3 = 244.72800005160613;
    ab4 = fb0 || fb1;
if(ao3 != null){
      ao3.m2(ad2, ad3, ad4, fd0, lb2, ab1, ab2, ab3);
}
    fd1 *= -1;
    ld1 *= -1;
    double ld4 = 287.12395861749707;
    Thought lo5 = Thought37.getInstance(ao4, fo0, fo1, ao1, ab4, fb0, fb1, lb2);
    double ld6 = 675.1512593369961;
    ab1 = ld3 < ld4;
    ld6 = ad1 + ad2;

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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3();
}
    if (lb0) {
        fb0 = fd1 > fd0;
if(fo1 != null){
          fo1.m2(fb1, lb0, fb0, fb1);
}
        fd1 = fd0 - fd1;
        double ld1 = 580.3467274215461;
        ld1 *= -1;
if(fo0 != null){
          lb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, fb0, fb1, lb0, fb0);
}
        } else {
        fd0 *= -1;
        fd1 = fd0 + fd1;
        fd0 = fd1 + fd0;
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
        if (lb0) {
if(fo1 != null){
              fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
            } else if (fb1) {
            Thought lo2 = Thought332.getInstance(fd0, fd1, fd0, fd1);
            fd0 = fd1 - fd0;
            lb0 = !fb0;
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
            fd1 *= -1;
if(fo0 != null){
              fb1 = fo0.m2();
}
if(fo0 != null){
              fo1 = fo0.m4(lb0, fb0, fb1, lb0);
}
            fb0 = !fb1;
}}
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = fd0 < fd1;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fd1 = fd0 + fd1;
    for(int i0=0; i0<10; i0++){
        boolean lb0 = true;
        Output.points[5][7] -= fd0;
        Thought lo1 = Thought58.getInstance(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
        fd1 = fd0 - fd1;
        Thought lo2 = Thought139.getInstance(fo1, fo0, fo1, fo0);
}
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
    ad1 = ad2 - ad3;
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ad1, ad2);
}
    Thought lo0 = Thought321.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
    boolean lb1 = false;
if(fo0 != null){
      fo0.m2();
}
if(fo1 != null){
      fo1.m1(lb1, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, lb1, fb0);
}
    fb1 = fd0 > fd1;
    lb1 = fb0 && fb1;
    ad1 = ad2 + ad3;
    double ld2 = 522.6656352954742;
    lb1 = fb0 && fb1;
    ad3 = ad4 + fd0;
    double ld3 = 439.43252087874333;
    boolean lb4 = false;
    fd0 *= -1;
    lb1 = fd1 < ld2;
    Thought lo5 = Thought164.getInstance(ld3, ad1, ad2, ad3, lb4, fb0, fb1, lb1);
    ad4 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb4, fb0, fb1, lb1);
}
    lb4 = fb0 || fb1;
if(fo0 != null){
      ld2 = fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb6 = false;
if(fo1 != null){
      ld3 = fo1.m3(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ld2;

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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ad2 > ad3;
    ab3 = !ab4;
    boolean lb0 = false;
    ab4 = fb0 || fb1;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo1 = Thought362.getInstance(lb0, ab1, ab2, ab3);
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, ab4, fb0, fb1, lb0);
}
    ad2 *= -1;
    ab1 = ab2 || ab3;
    ab4 = fb0 || fb1;
    Thought lo2 = Thought183.getInstance(ad3, ad4, fd0, fd1, lb0, ab1, ab2, ab3);
    ad1 *= -1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
    ad2 = ad3 + ad4;
    boolean lb3 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo4 = Thought28.getInstance(fd0, fd1, ad1, ad2);
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      fo0.m2();
}
    lb3 = ab1 || ab2;
    ab3 = ab4 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb0, lb3, ab1);
}
    ad2 = ad3 + ad4;
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, ad1, ad2, lb0, lb3, ab1, ab2);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 && fb1;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
    fb1 = fd1 > fd0;
    fb0 = !fb1;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    fb0 = fd1 > fd0;
    fd1 = fd0 + fd1;
    fd0 *= -1;
    fb1 = fb0 || fb1;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fb0 = fo1.m2();
}

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
    Thought lo0 = Thought122.getInstance(fb0, fb1, fb0, fb1);
    Thought lo1 = Thought194.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
    fd0 = fd1 + ad1;
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
    fb0 = fb1 || fb0;
    Thought lo2 = Thought351.getInstance(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
    fb1 = fd1 > ad1;
    fb0 = ad2 > ad3;
    fb1 = fb0 && fb1;

Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought179.getInstance(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
    double ld1 = 811.7975743052177;
    fb1 = !ab1;
    boolean lb2 = false;
    fd0 = fd1 - ld1;
    ab1 = !ab2;
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3);
}
    ab3 = fd1 < ld1;
if(ao4 != null){
      ao4.m2(fd0, fd1, ld1, fd0);
}
    ab4 = fd1 > ld1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ld1, fd0);
}
    double ld3 = 189.78969176239517;
    fd0 = fd1 + ld1;
    ld3 *= -1;
    Output.points[5][8] -= fd0;
    fd1 *= -1;

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
    boolean lb0 = false;
    double ld1 = 809.5361802959728;
    ld1 = ad1 - ad2;
if(ao2 != null){
      ao1 = ao2.m4();
}
    lb0 = ad3 < ad4;
    Thought lo2 = Thought256.getInstance(ab1, ab2, ab3, ab4);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld1, ad1, fb0, fb1, lb0, ab1);
}
if(ao3 != null){
      ab2 = ao3.m2(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    double ld3 = 705.5984002146588;
if(ao4 != null){
      lb0 = ao4.m2(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb0;

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
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb0 = true;
    fb0 = fd0 > fd1;
    fb1 = fd0 < fd1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    boolean lb1 = false;
    fd1 *= -1;
    lb0 = lb1 && fb0;
    fd0 = fd1 - fd0;
    Thought lo2 = Thought360.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    fb1 = fd1 < fd0;
                Thought lo3 = Thought126.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(lb0, lb1, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb0, lb1, fb0, fb1);
}
    boolean lb4 = true;
    Thought lo5 = Thought204.getInstance(fd0, fd1, fd0, fd1, lb0, lb1, lb4, fb0);
    fb1 = fd0 > fd1;

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
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    boolean lb0 = false;
    fd0 = fd1 + fd0;
        Output.points[6][0] -= fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    ab4 = !fb0;
    fb1 = lb0 || ab1;
    ab2 = fd0 > fd1;
    boolean lb1 = true;
    ab2 = ab3 || ab4;

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
    fb0 = !fb1;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = !fb1;
    ad1 = ad2 - ad3;
    boolean lb0 = true;
    lb0 = ad4 > fd0;
    fd1 = ad1 + ad2;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, fb0);
}
    Output.points[6][1] -= ad3;
    ad4 = fd0 - fd1;
    fb1 = lb0 || fb0;
    fb1 = lb0 || fb0;
    Thought lo1 = Thought221.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
    ad3 = ad4 - fd0;
    boolean lb2 = true;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    Output.points[6][2] += fd1;
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    Thought lo0 = Thought243.getInstance();
    boolean lb1 = true;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(lb1, lb2, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    double ld3 = 410.5906393816304;
if(fo0 != null){
      fo0.m1(ad3, ad4, fd0, fd1, lb1, lb2, ab1, ab2);
}
    ab3 = ld3 > ad1;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb1);
}
        lb2 = ab1 || ab2;
        ad2 = ad3 + ad4;
        }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab3 = ab4 && fb0;
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, ld3, ad1);
}
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3();
}
    ld3 = ad1 + ad2;
    boolean lb4 = true;
    Output.points[6][3] += ad3;
        boolean lb5 = true;
if(fo1 != null){
      fo0 = fo1.m4(lb2, lb4, lb5, ab1);
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
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        fd1 = fd0 - fd1;
        fd0 *= -1;
if(ao1 != null){
          fo1 = ao1.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
        Output.points[6][4] += fd1;
        fd0 *= -1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
        fb0 = fd1 > fd0;
        Thought lo0 = Thought120.getInstance(ao2, ao3, ao4, fo0);
        fd1 = fd0 + fd1;
        fd0 = fd1 - fd0;
        fb1 = !fb0;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2);
}
    fb1 = fb0 && fb1;
    boolean lb0 = true;
    lb0 = fb0 && fb1;
if(fo0 != null){
      ao4 = fo0.m4();
}
    ad3 *= -1;
    Thought lo1 = Thought88.getInstance(lb0, fb0, fb1, lb0);
    fb0 = ad4 > fd0;
    fb1 = lb0 && fb0;
    fb1 = lb0 || fb0;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3, fb1, lb0, fb0, fb1);
}
    lb0 = ad4 < fd0;
    double ld2 = 83.73868450675593;
    fd0 = fd1 + ld2;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
}
    Thought lo3 = Thought166.getInstance(ao1, ao2, ao3, ao4, fb1, lb0, fb0, fb1);
    lb0 = fb0 || fb1;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0);
}
    boolean lb0 = true;
    double ld1 = 806.8129895774539;
if(ao1 != null){
      fo1 = ao1.m4(ld1, fd0, fd1, ld1);
}
    boolean lb2 = false;
    double ld3 = 938.564486330271;
    boolean lb4 = false;
    Output.points[6][5] -= ld3;
    fd0 = fd1 - ld1;
    if (lb2) {
        lb4 = ab1 || ab2;
        Thought lo5 = Thought152.getInstance(ao2, ao3, ao4, fo0, ld3, fd0, fd1, ld1);
        ab3 = ld3 > fd0;
        fd1 = ld1 + ld3;
        ab4 = fd0 < fd1;
        double ld6 = 149.3804635045008;
if(fo1 != null){
          fb0 = fo1.m2();
}
        ld6 = ld1 - ld3;
        double ld7 = 518.5494667665004;
if(ao1 != null){
          ld3 = ao1.m3(fb1, lb0, lb2, lb4);
}
        ab1 = fd0 < fd1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld6, ld7, ld1, ld3, ab2, ab3, ab4, fb0);
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
    ad2 = ad3 - ad4;
    ab1 = fd0 > fd1;
    ab2 = ad1 < ad2;
if(ao2 != null){
      ad3 = ao2.m3(ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
    Thought lo0 = Thought255.getInstance(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
    fb1 = !ab1;
if(fo1 != null){
      fo1.m2(ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
    Thought lo1 = Thought248.getInstance();
        ad4 = fd0 - fd1;
    ad1 *= -1;
    ab2 = ad2 < ad3;
if(ao1 != null){
      ad4 = ao1.m3(ab3, ab4, fb0, fb1);
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
    boolean lb0 = true;
    Output.points[6][6] += fd0;
    Thought lo1 = Thought151.getInstance(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    fb0 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}

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
    double ld0 = 228.57764280224598;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
    Output.points[6][7] -= fd0;
    ab1 = ab2 && ab3;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb1 = false;
    fd1 = ld0 + fd0;
    boolean lb2 = true;
    ab2 = fd1 < ld0;
    fd0 = fd1 - ld0;
    for(int i0=0; i0<10; i0++){
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
    fb0 = fb1 && fb0;
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
    boolean lb0 = false;
    ad1 = ad2 - ad3;
    lb0 = ad4 < fd0;
    Thought lo1 = Thought263.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
    double ld2 = 829.4188444576488;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 && fb1;
    ld2 = ad1 + ad2;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m1(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    double ld0 = 230.72396038438845;
    ab1 = ad4 > fd0;
    Thought lo1 = Thought357.getInstance();
    ab2 = !ab3;
if(fo0 != null){
      fd1 = fo0.m3(ab4, fb0, fb1, ab1);
}
    ld0 *= -1;
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ad1, ab1, ab2, ab3, ab4);
}
    ad2 = ad3 - ad4;
    fb0 = fd0 < fd1;
    fb1 = ab1 && ab2;
    ld0 *= -1;
    Output.points[6][8] += ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}

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
    boolean lb0 = false;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
        for(int i0=0; i0<10; i0++){
        fd1 = fd0 - fd1;
        lb0 = fb0 || fb1;
        for(int i1=0; i1<10; i1++){
if(ao2 != null){
              ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
if(ao4 != null){
              ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
            lb0 = fd0 < fd1;
            fd0 *= -1;
            fd1 = fd0 + fd1;
if(ao3 != null){
              fd0 = ao3.m3();
}
            fd1 = fd0 + fd1;
if(ao4 != null){
              ao4.m3(fb0, fb1, lb0, fb0);
}
            double ld1 = 128.66974874330248;
            fb1 = lb0 || fb0;
            Thought lo2 = Thought187.getInstance(fo0, fo1, ao1, ao2, ld1, fd0, fd1, ld1, fb1, lb0, fb0, fb1);
            lb0 = !fb0;
if(ao4 != null){
              ao3 = ao4.m4(fd0, fd1, ld1, fd0, fb1, lb0, fb0, fb1);
}
            lb0 = fd1 > ld1;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
    double ld0 = 473.49650723500963;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    ad4 = fd0 + fd1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
    for(int i0=0; i0<10; i0++){
        boolean lb1 = false;
        fb0 = fb1 || lb1;
        fb0 = ld0 > ad1;
        }
    ad2 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ad3, ad4, fd0, fd1);
}

Thought.STACK_COUNTER++;
return ao2;
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
    ab1 = fd0 < fd1;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
        ab2 = ab3 && ab4;
    Output.points[7][0] += fd0;
if(ao1 != null){
      fo1 = ao1.m4();
}
    Output.points[7][1] -= fd1;
if(ao2 != null){
      ao2.m3(fb0, fb1, ab1, ab2);
}
    Thought lo0 = Thought209.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
    Thought lo1 = Thought397.getInstance(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
    fd0 = fd1 - fd0;
    if (fb0) {
        fd1 = fd0 - fd1;
        fb1 = ab1 && ab2;
if(ao1 != null){
          fd0 = ao1.m3(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
    Thought lo0 = Thought339.getInstance(ao1, ao2, ao3, ao4);
    ab3 = !ab4;
if(fo0 != null){
      fb0 = fo0.m2(ad2, ad3, ad4, fd0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3);
}
    boolean lb1 = false;
    fb0 = ad4 < fd0;
    Thought lo2 = Thought200.getInstance();
if(ao1 != null){
      fo1 = ao1.m4(fb1, lb1, ab1, ab2);
}
    if (ab3) {
        Thought lo3 = Thought87.getInstance(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3, ab4, fb0, fb1, lb1);
        Output.points[7][2] += ad4;
        ab1 = fd0 > fd1;
        ad1 *= -1;
        ad2 *= -1;
if(fo1 != null){
          ad3 = fo1.m3(ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
          ao1.m3(ao2, ao3, ao4, fo0, fb1, lb1, ab1, ab2);
}
if(fo1 != null){
          fo1.m1(ao1, ao2, ao3, ao4);
}
        if (ab3) {
            ad2 = ad3 - ad4;
            ab4 = fd0 < fd1;
            ad1 = ad2 + ad3;
            ad4 = fd0 - fd1;
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
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought368.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    boolean lb1 = true;
    fb0 = !fb1;
    double ld2 = 802.7150299933185;
if(fo1 != null){
      lb1 = fo1.m2();
}
    fb0 = ld2 < fd0;
    fb1 = !lb1;
    double ld3 = 965.829707473129;
        double ld4 = 406.2264766117699;
    ld4 = fd0 - fd1;
if(fo0 != null){
      ld2 = fo0.m3(fb0, fb1, lb1, fb0);
}
    ld3 = ld4 - fd0;
    fb1 = !lb1;

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
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < fd0;
    fb1 = !fb0;
    double ld0 = 873.3308211092252;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Output.points[7][3] += fd0;
    fd1 = ld0 + fd0;
    fb1 = fd1 > ld0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = fd0 > fd1;
    fb1 = ld0 > fd0;
    fd1 *= -1;
    double ld1 = 948.2693892958982;
    Output.points[7][4] += ld0;
    ld1 = fd0 + fd1;
    ld0 = ld1 + fd0;
    Thought lo2 = Thought141.getInstance(fd1, ld0, ld1, fd0);
    fb0 = fd1 < ld0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld0);
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
    fb0 = !fb1;
    fb0 = fb1 || fb0;
        fb1 = fb0 && fb1;
    Output.points[7][5] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 = fd1 - fd0;
    double ld0 = 753.36762554144;
    fd0 *= -1;
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
    fd1 = ld0 - fd0;

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
