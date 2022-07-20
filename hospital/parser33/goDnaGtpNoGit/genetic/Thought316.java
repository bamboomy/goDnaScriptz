package genetic;
import java.util.ArrayList;
class Thought316 extends Thought{
private static ArrayList<Thought316> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 129.0712261530181;
private double fd1 = 41.258772241800635;
private Thought fo0 = null;
private Thought fo1 = null;
Thought316 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought316 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought316 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought316 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought316 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought316 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought316 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought316 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought316 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought316 instance = new Thought316 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought316 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought316 instance = new Thought316 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought316 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought316 instance = new Thought316 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought316 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought316 instance = new Thought316 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought316 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought316 instance = new Thought316 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought316 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought316 instance = new Thought316 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought316 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought316 instance = new Thought316 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought316 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought316 instance = new Thought316 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
if(fo0 != null){
      fb0 = fo0.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = fd1 > fd0;
    fd1 = fd0 + fd1;
    fb0 = fb1 || fb0;
    Thought lo0 = Thought15.getInstance(fd0, fd1, fd0, fd1);
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    fd0 *= -1;
    for(int i0=0; i0<10; i0++){
        boolean lb1 = false;
        boolean lb2 = false;
if(fo0 != null){
          fo1 = fo0.m4();
}
        fd1 = fd0 + fd1;
if(fo1 != null){
          fd0 = fo1.m3(lb2, fb0, fb1, lb1);
}
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb2, fb0, fb1, lb1);
}
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1, lb2, fb0, fb1, lb1);
}
        boolean lb3 = false;
        fd0 *= -1;
        }
    fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    fb0 = fb1 || fb0;
    boolean lb4 = false;

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
    ab2 = ab3 || ab4;
        fb0 = fb1 || ab1;
    fd0 *= -1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    double ld0 = 44.59463789315932;
    Output.points[8][4] += fd0;
    ab2 = fd1 < ld0;
    ab3 = !ab4;
if(fo0 != null){
      fd0 = fo0.m3();
}
    fb0 = fb1 && ab1;
    Thought lo1 = Thought61.getInstance(ab2, ab3, ab4, fb0);
    double ld2 = 188.20148179442955;
    fb1 = fd0 > fd1;
    ab1 = ab2 || ab3;
    ld0 = ld2 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, ld2, fd0, ab4, fb0, fb1, ab1);
}
    fd1 *= -1;
    ld0 *= -1;
    ab2 = !ab3;
    ld2 = fd0 - fd1;

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
    fb1 = !fb0;
if(fo1 != null){
      fo1.m3(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
    double ld0 = 403.492523541088;
    ld0 = ad1 + ad2;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought277.getInstance(fo1, fo0, fo1, fo0);
        ad3 = ad4 - fd0;
    fb0 = fb1 && fb0;
    fd1 *= -1;
    fb1 = ld0 < ad1;
    Thought lo2 = Thought25.getInstance(ad2, ad3, ad4, fd0);
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld0, ad1, ad2);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    ad3 = ad4 + fd0;
if(fo0 != null){
      fo0.m1(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, ad1, ad2, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    ad3 = ad4 + fd0;

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
if(fo0 != null){
      fo0.m3(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
    fb1 = fd1 < ad1;
    ad2 *= -1;
    Thought lo0 = Thought81.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fo0.m3(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    double ld1 = 564.558516749957;
if(fo0 != null){
      fd0 = fo0.m3();
}
    ab1 = fd1 < ld1;
    ab2 = ad1 < ad2;
    ad3 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
    ab1 = !ab2;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld1, ab3, ab4, fb0, fb1);
}
    ad1 *= -1;
    for(int i0=0; i0<10; i0++){
        if (ab1) {
if(fo0 != null){
              fo0.m2(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
            fb1 = !ab1;
            for(int i1=0; i1<10; i1++){
                fd1 = ld1 - ad1;
                ad2 = ad3 - ad4;
                Thought lo2 = Thought354.getInstance(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
if(fo1 != null){
                  fo1.m1(fo0, fo1, fo0, fo1);
}
                Output.points[8][5] += fd0;
}}}
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
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    Output.points[8][6] -= fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    boolean lb0 = true;
    Thought lo1 = Thought245.getInstance(fb0, fb1, lb0, fb0);
    fd1 = fd0 - fd1;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb2);
}
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb2);
}
    boolean lb3 = false;
    lb3 = fd0 < fd1;
    boolean lb4 = true;
    boolean lb5 = true;

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
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
    ad1 = ad2 + ad3;
    Thought lo0 = Thought358.getInstance(ad4, fd0, fd1, ad1);
        fb0 = fb1 || fb0;
    ad2 *= -1;
    ad3 = ad4 - fd0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      ad4 = fo1.m3();
}
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
    boolean lb1 = false;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2, fb0, fb1, lb1, fb0);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, ab1, ab2);
}
    fd0 *= -1;
    fd1 = fd0 - fd1;
    Thought lo0 = Thought323.getInstance(ao4, fo0, fo1, ao1);
    Output.points[8][7] += fd0;
    boolean lb1 = false;
if(ao2 != null){
      ao2.m1(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    Output.points[8][8] -= fd1;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    ab2 = fd1 > fd0;
    boolean lb2 = true;
if(ao3 != null){
      ao2 = ao3.m4();
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
    for(int i0=0; i0<10; i0++){
        ad2 = ad3 - ad4;
        fd0 = fd1 - ad1;
        double ld0 = 967.2529791271045;
        Output.points[0][0] += ad1;
        boolean lb1 = true;
if(ao3 != null){
          ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
        fb0 = fb1 && lb1;
        Output.points[0][1] += ad2;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
        fb0 = ld0 < ad1;
if(ao4 != null){
          ao4.m3(ad2, ad3, ad4, fd0, fb1, lb1, ab1, ab2);
}
        }
    ad1 *= -1;

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
    boolean lb0 = true;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 && fb1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1);
}
        lb0 = fd0 > fd1;
    fd0 = fd1 + fd0;
    Thought lo1 = Thought315.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    fb0 = !fb1;
    fd1 = fd0 + fd1;
    boolean lb2 = false;
    if (lb0) {
        boolean lb3 = false;
        boolean lb4 = false;
        if (lb4) {
if(fo1 != null){
              lb0 = fo1.m2();
}
            Thought lo5 = Thought267.getInstance(lb2, fb0, fb1, lb3);
            fd0 = fd1 - fd0;
            } else if (lb4) {
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
    ab2 = ab3 || ab4;
    fb0 = fb1 || ab1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab2 = ab3 && ab4;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo0 = Thought75.getInstance(ab2, ab3, ab4, fb0);
    fd1 = fd0 + fd1;

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
    fb0 = ad4 < fd0;
    fb1 = fd1 > ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    double ld0 = 520.8226826897484;
    fb0 = fb1 && fb0;
    Thought lo1 = Thought238.getInstance(fd0, fd1, ld0, ad1, fb1, fb0, fb1, fb0);
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    ad3 = ad4 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd1 *= -1;
    boolean lb2 = false;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          ld0 = fo1.m3(ad1, ad2, ad3, ad4);
}
        fd0 = fd1 - ld0;
        if (fb0) {
            Thought lo3 = Thought251.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
            fd0 *= -1;
            Thought lo4 = Thought132.getInstance();
            Thought lo5 = Thought260.getInstance(fb1, lb2, fb0, fb1);
            Output.points[0][2] -= fd1;
}}
Thought.STACK_COUNTER++;
return lb2;
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
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
if(fo1 != null){
      fo1.m1(fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
    ad3 *= -1;
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fb1 = !ab1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    Output.points[0][3] += ad1;
    ab2 = ad2 < ad3;
    Thought lo0 = Thought233.getInstance();
if(fo1 != null){
      ad4 = fo1.m3(ab3, ab4, fb0, fb1);
}
    boolean lb1 = true;
    fd0 = fd1 - ad1;
    Output.points[0][4] += ad2;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, lb1, ab1, ab2, ab3);
}
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo1.m3(fd0, fd1, ad1, ad2, ab4, fb0, fb1, lb1);
}
    ab1 = ad3 < ad4;
    ab2 = fd0 > fd1;
    ad1 = ad2 + ad3;
    ab3 = !ab4;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb1, ab1, ab2);
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    fb0 = fd0 < fd1;
    fb1 = fd0 < fd1;
    Thought lo0 = Thought137.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
    double ld1 = 161.425951832167;
    ld1 = fd0 + fd1;
    fb0 = ld1 > fd0;
if(ao2 != null){
      fd1 = ao2.m3();
}
    Thought lo2 = Thought70.getInstance(fb1, fb0, fb1, fb0);
    fb1 = fb0 || fb1;
    boolean lb3 = false;
if(ao3 != null){
      lb3 = ao3.m2(ao4, fo0, fo1, ao1, ld1, fd0, fd1, ld1, fb0, fb1, lb3, fb0);
}
    fd0 = fd1 + ld1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld1, fd0, fb1, lb3, fb0, fb1);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, lb3, fb0, fb1, lb3);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        ad1 *= -1;
    Thought lo0 = Thought371.getInstance(ao1, ao2, ao3, ao4);
if(fo0 != null){
      fo0.m3(ad2, ad3, ad4, fd0);
}
    fb0 = !fb1;
    fb0 = fd1 > ad1;
    fb1 = fb0 && fb1;
if(fo1 != null){
      ad2 = fo1.m3(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
}
    fb0 = fb1 && fb0;
    fb1 = ad1 > ad2;
    ad3 = ad4 + fd0;
    fd1 = ad1 + ad2;
if(fo0 != null){
      fo0.m2();
}
    fb0 = fb1 || fb0;
    fb1 = ad3 > ad4;

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
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    ab1 = !ab2;
    Output.points[0][5] -= fd0;
    fd1 = fd0 - fd1;
    double ld0 = 165.71169410534102;
    ld0 = fd0 + fd1;
    double ld1 = 505.6514040664506;
    boolean lb2 = false;
    double ld3 = 86.43099519673275;
    ab2 = !ab3;
if(ao4 != null){
      ao3 = ao4.m4(ld0, ld1, ld3, fd0, ab4, fb0, fb1, lb2);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
}
    fd1 *= -1;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3);
}
    if (fb0) {
if(ao4 != null){
          ao4.m3(ld0, ld1, ld3, fd0);
}
        Thought lo4 = Thought173.getInstance(fo0, fo1, ao1, ao2, fd1, ld0, ld1, ld3);
        boolean lb5 = false;
if(ao3 != null){
          ao3.m2();
}
        fb0 = fb1 && lb5;
        lb2 = !ab1;
        ab2 = ab3 && ab4;
if(ao4 != null){
          fb0 = ao4.m2(fb1, lb5, lb2, ab1);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ld0, ld1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(ld3, fd0, fd1, ld0, fb1, lb5, lb2, ab1);
}
if(ao1 != null){
          ld1 = ao1.m3(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
        fb1 = !lb5;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      lb0 = ao1.m2(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ad1;
    ab1 = ab2 && ab3;
    ad2 *= -1;
    ab4 = ad3 < ad4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
if(ao2 != null){
      ad3 = ao2.m3();
}
    fb0 = fb1 || lb0;
    ab1 = !ab2;
if(ao4 != null){
      ao3 = ao4.m4(ab3, ab4, fb0, fb1);
}
    double ld1 = 578.7445800159618;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
    boolean lb0 = false;
    Output.points[0][6] -= fd0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    Output.points[0][7] += fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    fb1 = fd1 > fd0;
    Thought lo1 = Thought397.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m3(lb0, fb0, fb1, lb0);
}
    double ld2 = 291.39534614255507;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld2, fb1, lb0, fb0, fb1);
}
    Output.points[0][8] += fd0;
    boolean lb3 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld2, fd0, fd1, lb0, lb3, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, lb3, fb0, fb1);
}
    boolean lb4 = true;
    lb0 = lb3 && lb4;
    Thought lo5 = Thought176.getInstance(fo1, fo0, fo1, fo0);
    if (fb0) {
if(fo0 != null){
          fo1 = fo0.m4(ld2, fd0, fd1, ld2);
}
        double ld6 = 289.26762260824216;
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
    ab1 = ab2 && ab3;
    ab4 = fb0 && fb1;
    ab1 = fd0 < fd1;
    boolean lb0 = true;
    ab1 = !ab2;
    boolean lb1 = false;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3();
}
    fd1 *= -1;
    Output.points[1][0] += fd0;
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb0, lb1, ab1);
}
    ab2 = ab3 || ab4;
    fb0 = fb1 && lb0;
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1, lb1, ab1, ab2, ab3);
}
    boolean lb2 = true;
    Thought lo3 = Thought134.getInstance(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    lb0 = fd0 < fd1;
    Thought lo4 = Thought245.getInstance(fd0, fd1, fd0, fd1);
    lb1 = !lb2;
    ab1 = fd0 > fd1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
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
if(fo1 != null){
      ad2 = fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    ad1 = ad2 + ad3;
    fb0 = ad4 < fd0;
    fb1 = fd1 > ad1;
        Output.points[1][1] += ad2;
    ad3 *= -1;
if(fo0 != null){
      fo0.m3(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    boolean lb1 = false;
    lb0 = ad2 > ad3;
    double ld2 = 728.5786361049735;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb0);
}
    boolean lb3 = false;
    boolean lb4 = true;
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    double ld5 = 324.0085069219806;

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad2 > ad3;
    ad4 *= -1;
    boolean lb0 = false;
    double ld1 = 328.37507111577185;
    Thought lo2 = Thought294.getInstance(ad4, fd0, fd1, ld1);
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    boolean lb3 = true;
    if (lb3) {
        boolean lb4 = true;
if(fo0 != null){
          fo0.m2();
}
        Thought lo5 = Thought221.getInstance(lb3, ab1, ab2, ab3);
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, ad1, ad2, ab4, fb0, fb1, lb4);
}
if(fo0 != null){
          fo1 = fo0.m4(ad3, ad4, fd0, fd1, lb0, lb3, ab1, ab2);
}
        ab3 = ab4 || fb0;
        boolean lb6 = true;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
    Thought lo0 = Thought138.getInstance(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
    double ld1 = 399.5057992204563;
        double ld2 = 231.62415639792903;
    fb1 = ld2 < fd0;
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4);
}
    fb0 = ld1 > ld2;
    boolean lb3 = true;
    fb0 = fb1 && lb3;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fb1 = fo0.m2(ld1, ld2, fd0, fd1);
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    boolean lb0 = true;
if(ao4 != null){
      fd1 = ao4.m3(lb0, fb0, fb1, lb0);
}
    fb0 = ad1 > ad2;
if(fo0 != null){
      ad3 = fo0.m3(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1, fb1, lb0, fb0, fb1);
}
    boolean lb1 = true;
    lb0 = !lb1;
if(fo0 != null){
      ao4 = fo0.m4(ad2, ad3, ad4, fd0, fb0, fb1, lb0, lb1);
}
    boolean lb2 = true;
    double ld3 = 593.0656853613277;
    Thought lo4 = Thought203.getInstance(fo1, ao1, ao2, ao3, lb2, fb0, fb1, lb0);
    lb1 = lb2 && fb0;
    fb1 = fd0 < fd1;
    ld3 = ad1 + ad2;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    ad3 *= -1;
    ad4 *= -1;
    lb0 = !lb1;
    boolean lb5 = true;
    fd0 = fd1 - ld3;
    lb2 = ad1 > ad2;
    lb5 = ad3 < ad4;
if(ao4 != null){
      fb0 = ao4.m2(fd0, fd1, ld3, ad1);
}
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
}
    if (fb1) {
        fd1 = ld3 + ad1;
        ad2 = ad3 - ad4;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
    double ld0 = 835.2571337437757;
    ab4 = fb0 || fb1;
if(ao2 != null){
      ao2.m2();
}
if(ao4 != null){
      ao3 = ao4.m4(ab1, ab2, ab3, ab4);
}
        fb0 = fb1 || ab1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld0, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
    fd0 *= -1;
    ab3 = ab4 && fb0;
    boolean lb1 = false;
if(fo0 != null){
      fd1 = fo0.m3(ld0, fd0, fd1, ld0, fb0, fb1, lb1, ab1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
    ab3 = ab4 && fb0;
    double ld0 = 252.37187849244478;
if(ao2 != null){
      ld0 = ao2.m3(ao3, ao4, fo0, fo1, fb1, ab1, ab2, ab3);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(ad1, ad2, ad3, ad4);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld0, ad1);
}
if(ao2 != null){
      ao2.m2();
}
if(ao4 != null){
      ao3 = ao4.m4(ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      ad2 = fo0.m3(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(ld0, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}
    ab4 = ad4 < fd0;
    boolean lb1 = true;

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
    double ld0 = 85.31386844619189;
    boolean lb1 = false;
    lb1 = fb0 && fb1;
    Output.points[1][2] -= ld0;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
}
    fd1 = ld0 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 = ld0 - fd0;
    fd1 = ld0 + fd0;
if(fo0 != null){
      fo0.m3(fd1, ld0, fd0, fd1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
    fb0 = fd0 < fd1;
if(fo0 != null){
      fb1 = fo0.m2();
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fd0 = fo0.m3(ab1, ab2, ab3, ab4);
}
    fb0 = fd1 < fd0;
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
}
    ab2 = fd1 > fd0;
    Output.points[1][3] += fd1;
    ab3 = !ab4;
    fb0 = fd0 > fd1;
    fb1 = !lb0;
    boolean lb1 = false;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0, lb1, ab1, ab2, ab3);
}
    fd1 = fd0 + fd1;
    ab4 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    Thought lo2 = Thought183.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
        double ld3 = 372.4021747535871;
    ab1 = ld3 > fd0;

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
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fb1 = !fb0;
    double ld0 = 743.408023259463;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    ad1 = ad2 - ad3;
    boolean lb1 = true;
    Thought lo2 = Thought278.getInstance(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);

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
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    ad2 = ad3 + ad4;
    ab2 = fd0 > fd1;
    ab3 = ab4 && fb0;
    double ld0 = 564.8490700767411;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(ld0, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;
    fb0 = fb1 && lb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld2 = 907.8250970245143;

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
    Thought lo0 = Thought83.getInstance(fb1, fb0, fb1, fb0);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    if (fb1) {
        fb0 = fd0 > fd1;
if(ao2 != null){
          fd0 = ao2.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
          fd1 = ao3.m3(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1);
}
        fd0 = fd1 - fd0;
if(ao2 != null){
          ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
        for(int i0=0; i0<10; i0++){
            Output.points[1][4] += fd1;
            boolean lb1 = false;
            fb0 = !fb1;
            fd0 *= -1;
}}
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
    double ld0 = 338.616104706967;
    boolean lb1 = false;
    if (lb1) {
        fb0 = fb1 || lb1;
        fb0 = fb1 || lb1;
        fb0 = fb1 || lb1;
        Thought lo2 = Thought87.getInstance();
        fb0 = ad2 > ad3;
        double ld3 = 998.3937487420864;
if(ao3 != null){
          ao2 = ao3.m4(fb1, lb1, fb0, fb1);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, lb1, fb0, fb1, lb1);
}
        boolean lb4 = false;
if(fo0 != null){
          ao4 = fo0.m4(ld3, ld0, ad1, ad2, lb1, fb0, fb1, lb4);
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, lb1, fb0, fb1, lb4);
}
        ad3 = ad4 + fd0;
        lb1 = fd1 < ld3;
        ld0 *= -1;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
          fo1.m2(ad1, ad2, ad3, ad4);
}
        Thought lo5 = Thought62.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, ld3, ld0);
        fb0 = !fb1;
if(fo0 != null){
          fo0.m1();
}
        ad1 = ad2 + ad3;
        lb4 = lb1 || fb0;
        fb1 = ad4 > fd0;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 409.8048177026886;
    ab1 = !ab2;
if(ao1 != null){
      ld0 = ao1.m3(ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      ao2.m3(fd1, ld0, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(ao3 != null){
      ab3 = ao3.m2(ao4, fo0, fo1, ao1, ab4, fb0, fb1, ab1);
}
    ab2 = ld0 > fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ab3 = fd1 < ld0;
    boolean lb1 = true;
        ab3 = ab4 || fb0;
    Thought lo2 = Thought12.getInstance(fd0, fd1, ld0, fd0);
    fb1 = lb1 && ab1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld0, fd0, fd1);
}
    ld0 *= -1;
    ab2 = ab3 && ab4;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 || ab4;
    fb0 = fb1 && ab1;
    Thought lo0 = Thought352.getInstance();
    ad2 = ad3 - ad4;
    fd0 *= -1;
    double ld1 = 836.2834532878592;
    fd0 = fd1 + ld1;
if(ao2 != null){
      ao1 = ao2.m4(ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
    ab4 = fd0 < fd1;

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
        Thought lo0 = Thought269.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    Output.points[1][5] -= fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
    Output.points[1][6] -= fd0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    Output.points[1][7] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    double ld1 = 621.4796831816839;
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = fb0 && fb1;
    double ld2 = 937.2353613357341;
    fd0 = fd1 - ld1;
    fb0 = fb1 || fb0;
    boolean lb3 = false;

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
      fd1 = fo1.m3(fb1, fb0, fb1, fb0);
}
    Output.points[1][8] += fd0;
    fd1 *= -1;
    Output.points[2][0] -= fd0;
    double ld0 = 996.9448873927023;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    double ld1 = 983.9244299924133;
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ld1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb2 = false;
    double ld3 = 846.5895498569095;
if(fo1 != null){
      fo1.m3(ld0, ld1, ld3, fd0);
}
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fd1, ld0, ld1, ld3);
}
    boolean lb4 = false;
    fd0 = fd1 + ld0;
    ld1 = ld3 + fd0;

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
    Output.points[2][1] -= fd0;
    double ld0 = 883.8651718150759;
    Thought lo1 = Thought165.getInstance();
    fb1 = fd0 > fd1;
    fb0 = ld0 < fd0;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo1.m3(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      ld0 = fo1.m3(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    Thought lo2 = Thought62.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb3 = true;
    fd1 = ld0 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, fd0, fd1);
}
    fb0 = fb1 && lb3;
    fb0 = ld0 > fd0;
    fb1 = lb3 && fb0;
    fb1 = !lb3;
    Output.points[2][2] += fd1;
    double ld4 = 817.1545377774829;
    fb0 = ld0 > ld4;
    Thought lo5 = Thought110.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld4);

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
